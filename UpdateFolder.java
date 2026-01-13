package com.document360.service;

import com.document360.client.ApiClient;
import com.document360.config.ApiConfig;

public class UpdateFolder {

    public static void run(String id) throws Exception {
        String url = ApiConfig.BASE_URL + "/" + id;
        String body = "{ \"name\": \"UpdatedFolder\" }";

        ApiClient.send("PUT", url, body, ApiConfig.API_TOKEN);
    }
}
