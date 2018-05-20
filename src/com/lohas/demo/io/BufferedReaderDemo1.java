package com.lohas.demo.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5.
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args)throws  Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag){
            System.out.println("请输入年龄：");
            String str = bufferedReader.readLine();
            //正则表达式的判断
            if (str.matches("\\d+")){
                System.out.println("输入的年龄：" + Integer.valueOf(str));
                flag = false;
            } else{
                System.out.println("请输入正确的年龄的信息！");
            }
        }
        bufferedReader.close();

    }
}
