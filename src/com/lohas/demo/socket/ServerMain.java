package com.lohas.demo.socket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/5/9.
 */
public class ServerMain {
    public static void main(String[] args) throws Exception{
        //表示在本机的8888端口监听
        ServerSocket server = new ServerSocket(8888);
        System.out.println("等待客户端连接。。。");
        //进入到阻塞状态，等待
        Socket client = server.accept();
        //表示向客户端输出
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println("Hello world!");
        out.close();
        server.close();
    }
}
