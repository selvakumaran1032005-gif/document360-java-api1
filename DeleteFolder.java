package com.document360.service;

import com.document360.client.ApiClient;
import com.document360.config.ApiConfig;

public class DeleteFolder {

    public static void run(String id) throws Exception {
        ApiClient.send(
                "DELETE",
                ApiConfig.BASE_URL + "/" + id,
                null,
                ApiConfig.API_TOKEN);
    }
}
