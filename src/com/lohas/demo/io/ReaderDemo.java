package com.lohas.demo.io;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Administrator on 2018/5/1.
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception{
        //第一步：定义要输入文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        if (file.exists()){
            Reader reader = new FileReader(file);
            char data[] = new char[1024];
            int len = reader.read(data);//向字符数组保存数据，返回长度
            System.out.println(new String(data,0,len));
            reader.close();
        }
    }
}
