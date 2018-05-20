package com.lohas.demo.socket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/9.
 */
public class EchoServer {
    public static void main(String[] args) throws Exception{
        //表示在本机的8888端口监听
        ServerSocket server = new ServerSocket(8888);
        System.out.println("等待客户端连接。。。");
        //有客户端连接了
        Socket client = server.accept();
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        //表示向客户端输出
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag){
            if (scanner.hasNext()){
                String str = scanner.next().trim();//消除空格
                if ("bye".equalsIgnoreCase(str)){
                    flag = false;
                    out.println("你已经退出连接。。。");
                }else {
                    out.println("ECHO: " + str);
                }
            }
        }
        out.close();
        scanner.close();
        server.close();
    }

}
