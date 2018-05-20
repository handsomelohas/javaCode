package com.lohas.demo.socket;

import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/9.
 */
public class ClientMain {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1", 8888);
        //接收服务器输入数据
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        if (scanner.hasNext()){
            System.out.println("【服务器响应数据】: " + scanner.next());
        }
        scanner.close();
        client.close();
    }
}
