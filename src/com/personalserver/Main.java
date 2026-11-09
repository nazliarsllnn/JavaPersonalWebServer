package com.personalserver;

public class Main {

    public static void main(String[] args) {

        PageProvider pageProvider = new HtmlPage();

        ResponseBuilder responseBuilder = new HttpResponse();

        ClientHandler clientHandler = new ClientHandler(
                pageProvider,
                responseBuilder
        );

        WebServer webServer = new WebServer(clientHandler);

        webServer.start();
    }
}