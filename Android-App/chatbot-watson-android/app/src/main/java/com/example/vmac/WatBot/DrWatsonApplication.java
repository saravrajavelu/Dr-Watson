package com.example.vmac.WatBot;

import android.app.Application;

public class DrWatsonApplication extends Application {

    public static String WORKSPACE_ID = WorkspaceIds.IRON;

    public static class WorkspaceIds {
//        public static String IRON = "6e8cfded-d07d-4df9-8ebd-c193306c32c5";
        public static String IRON = "0d61ba5d-5f73-4700-b331-9ea9ae300a48";
        public static String TB = "d6822c8b-9c1b-460c-8271-0d12b6502a6b";
//        public static String TB = "51a3b753-4a13-4e2a-a847-389eb89e5a94";
    }

    public static void setWorkspaceId(String workspaceId) {
        WORKSPACE_ID = workspaceId;
    }
}
