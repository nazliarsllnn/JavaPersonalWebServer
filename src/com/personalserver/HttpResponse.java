package com.personalserver;

import java.nio.charset.StandardCharsets;

public class HttpResponse implements ResponseBuilder {

    @Override
    public byte[] create(String html) {

        byte[] body = html.getBytes(StandardCharsets.UTF_8);

        String headers =
                "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n" +
                        "Content-Length: " + body.length + "\r\n" +
                        "Connection: close\r\n" +
                        "\r\n";

        byte[] headerBytes = headers.getBytes(StandardCharsets.UTF_8);

        byte[] response = new byte[headerBytes.length + body.length];

        System.arraycopy(
                headerBytes, 0,
                response, 0,
                headerBytes.length
        );

        System.arraycopy(
                body, 0,
                response, headerBytes.length,
                body.length
        );

        return response;
    }
}