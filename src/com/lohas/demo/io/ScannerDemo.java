package com.lohas.demo.io;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/5.
 */
public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //设置读取分割符
//        scanner.useDelimiter("\n");
//        System.out.print("请输入信息：");
//        if(scanner.hasNext()){
//            System.out.println("输入内容：" + scanner.next());
//        }
//        scanner.close();

        //hasNext类型（）next类型()
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("请输入年龄：");
//        if(scanner1.hasNextInt()){
//            System.out.println("输入年龄：" + scanner1.nextInt());
//        } else {
//            System.out.println("请输入正确的信息");
//        }
//        scanner1.close();

        //正则支持
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("输入日期:");
        if(scanner2.hasNext("\\d{4}-\\d{2}-\\d{2}")){
            System.out.println("输入内容：" + scanner2.next("\\d{4}-\\d{2}-\\d{2}"));
        } else {
            System.out.println("请输入正确的信息");
        }
        scanner2.close();
    }
}
