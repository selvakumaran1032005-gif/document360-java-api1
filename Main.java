package com.document360;

import com.document360.service.*;

public class Main {
    public static void main(String[] args) {
        try {
            GetFolders.run();
            String id = CreateFolder.run();
            UpdateFolder.run(id);
            DeleteFolder.run(id);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
