package com.document360.service;

import com.document360.client.ApiClient;
import com.document360.config.ApiConfig;

public class CreateFolder {
    public static String run() throws Exception {
        String body = "{ \"title\": \"TestFolder\", " +
                "\"user_id\": \"9bc90a13-4c7a-45e6-b51d-839bc3a5a209\" }";
        var response = ApiClient.send(
                "POST",
                ApiConfig.BASE_URL,
                body,
                ApiConfig.API_TOKEN);
        if (!response.body().contains("\"media_folder_id\"")) {
            throw new RuntimeException(
                    "Folder creation failed: " + response.body());
        }
        String folderId = response.body()
                .split("\"media_folder_id\":\"")[1]
                .split("\"")[0];

        System.out.println("CREATED FOLDER ID: " + folderId);
        return folderId;
    }
}
