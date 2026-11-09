package com.personalserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private static final int PORT = 1989;

    private final ClientHandler clientHandler;

    public WebServer(ClientHandler clientHandler) {
        this.clientHandler = clientHandler;
    }

    public void start() {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            System.out.println("Web sunucusu baslatildi!");
            System.out.println("Port: " + PORT);
            System.out.println("Adres: http://localhost:" + PORT);
            System.out.println("Baglanti bekleniyor...");

            while (true) {

                Socket clientSocket = serverSocket.accept();

                System.out.println(
                        "Yeni istemci baglandi: "
                                + clientSocket.getInetAddress()
                );

                Thread clientThread = new Thread(
                        () -> clientHandler.handle(clientSocket)
                );

                clientThread.start();
            }

        } catch (IOException e) {

            System.out.println(
                    "Sunucu baslatilirken hata olustu: "
                            + e.getMessage()
            );
        }
    }
}