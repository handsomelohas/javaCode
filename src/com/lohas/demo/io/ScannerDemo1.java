package com.lohas.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/5.
 */
public class ScannerDemo1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new FileInputStream(new File("C:" + File.separator + "demoIO" + File.separator + "my.txt")));
        //System.getProperty("line.separator") 根据系统获取换行符（File.separator）
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()){//判断是否有内容
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
