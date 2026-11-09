package com.personalserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientHandler {

    private final PageProvider pageProvider;
    private final ResponseBuilder responseBuilder;

    public ClientHandler(PageProvider pageProvider,
                         ResponseBuilder responseBuilder) {

        this.pageProvider = pageProvider;
        this.responseBuilder = responseBuilder;
    }

    public void handle(Socket clientSocket) {

        try (
                Socket socket = clientSocket;
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),
                                StandardCharsets.UTF_8
                        )
                );
                OutputStream output = socket.getOutputStream()
        ) {

            String requestLine = reader.readLine();

            System.out.println("Gelen istek: " + requestLine);

            String line;

            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                System.out.println(line);
            }

            String html = pageProvider.generatePage();

            byte[] response = responseBuilder.create(html);

            output.write(response);
            output.flush();

            System.out.println("HTML sayfasi istemciye gonderildi.");

        } catch (IOException e) {

            System.out.println(
                    "Istemci baglantisinda hata: " + e.getMessage()
            );
        }
    }
}