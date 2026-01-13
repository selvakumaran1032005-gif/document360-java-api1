package com.document360.service;

import com.document360.client.ApiClient;
import com.document360.config.ApiConfig;

public class GetFolders {
    public static void run() throws Exception {
        ApiClient.send("GET", ApiConfig.BASE_URL, null, ApiConfig.API_TOKEN);
    }
}
