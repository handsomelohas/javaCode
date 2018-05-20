package com.lohas.demo.socket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/9.
 */
public class EchoClient2 {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1", 8888);
        //键盘输入信息
        Scanner input = new Scanner(System.in);
        //获取服务器端输出信息
        Scanner in = new Scanner(client.getInputStream());
        in.useDelimiter("\n");
        //向服务器端输出信息
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag){
            System.out.print("请输入信息：");
            if (input.hasNext()){
                String str = input.next().trim();//取得输入信息
                //将信息发送给服务器端
                out.println(str);
                //接收服务器端响应信息
                if (in.hasNext()){
                    System.out.println(in.next().trim());
                }
                if ("bye".equalsIgnoreCase(str)){
                    flag = false;
                }
            }
        }
        in.close();
        out.close();
        input.close();
        client.close();
    }
}
