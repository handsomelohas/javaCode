package com.lohas.demo.io;

import java.io.*;

/**
 * Created by Administrator on 2018/5/5.
 */
public class BufferedReaderDemo2 {
    public static void main(String[] args)throws  Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:" + File.separator + "demoIO" + File.separator + "my.txt")));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:" + File.separator + "demoIO" + File.separator + "my.txt"));
        String str = null;
        while((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
