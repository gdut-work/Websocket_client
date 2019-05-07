package com.chenwt.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @class：WebSocketClient
 * @campany：zkzj
 * @author:chenwt
 * @date:2019-05-07 16:12
 * @description:
 */
public class AppWebSocketClient extends WebSocketClient {
    /**
     * 客户端注册信息
     */
    private String appClientInfo;

    public AppWebSocketClient(String serverUrl,String appClientInfo) throws URISyntaxException {
        super(new URI(serverUrl));
        this.appClientInfo = appClientInfo;
    }

    public AppWebSocketClient(URI serverUri,String appClientInfo) {
        super(serverUri);
        this.appClientInfo = appClientInfo;
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        // TODO Auto-generated method stub
        System.out.println("打开链接");
        System.out.println("------ AppWebSocketClient onOpen ------");
        sendClientInfo();
    }

    /**
     * 发送客户端信息
     */
    private void sendClientInfo() {
        send(appClientInfo);
    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        // TODO Auto-generated method stub
        System.out.println("链接已关闭");
        System.out.println("------ AppWebSocketClient onClose ------");
    }

    @Override
    public void onError(Exception ex) {
        // TODO Auto-generated method stub
        System.out.println("发生错误已关闭");
        System.out.println("------ AppWebSocketClient onError ------");
        ex.printStackTrace();
    }

    @Override
    public void onMessage(String dataResponseBeanStr) {
        // TODO Auto-generated method stub
        System.out.println("收到消息"+dataResponseBeanStr);
        System.out.println("-------- 接收到服务端数据： " + dataResponseBeanStr + "--------");
    }
}
