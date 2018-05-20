package com.lohas.demo.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5.
 */
public class BufferedReadDemo {
    public static void main(String[] args)throws  Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入信息：");
        String str = bufferedReader.readLine();
        System.out.println("输入的信息：" + str);
        bufferedReader.close();
    }
}
