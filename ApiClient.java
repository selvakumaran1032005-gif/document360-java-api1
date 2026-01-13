package com.document360.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final HttpClient client = HttpClient.newHttpClient();

    public static HttpResponse<String> send(
            String method, String url, String body, String token) throws Exception {

        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("api_token", token)
                .header("Content-Type", "application/json");

        if (method.equals("POST") || method.equals("PUT")) {
            builder.method(method, HttpRequest.BodyPublishers.ofString(body));
        } else {
            builder.method(method, HttpRequest.BodyPublishers.noBody());
        }

        HttpResponse<String> response = client.send(builder.build(), HttpResponse.BodyHandlers.ofString());

        System.out.println("\n" + method + " " + url);
        System.out.println("STATUS: " + response.statusCode());
        System.out.println(response.body());

        return response;
    }
}
