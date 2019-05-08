package com.chenwt.websocket;

/**
 * @class：TestApp
 * @campany：zkzj
 * @author:feiniaoying
 * @date:2019-05-06 23:58
 * @description:
 */

public class TestApp {
    private static String serverUrl = "ws://127.0.0.1/admin/websocket/app";
    private static String appClientInfo = "{\n" +
            "    \"type\": 1\n" +
            "\t\"clientInfo\": {\n" +
            "\t\t\"phone\": \"138001380000\",\n" +
            "\t\t\"name1\": \"1\",\n" +
            "\t\t\"name2\": \"2\",\n" +
            "\t\t\"name3\": \"3\",\n" +
            "\t\t\"name4\": \"4\"\n" +
            "\t}\n" +
            "}";

    public static void main(String[] args) {
        try {
            AppWebSocketClient appWebSocketClient = new AppWebSocketClient(serverUrl,appClientInfo);
            appWebSocketClient.connect();
            while (true){
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



