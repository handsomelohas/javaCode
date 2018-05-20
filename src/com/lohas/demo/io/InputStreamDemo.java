package com.lohas.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/5/1.
 */
public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        //第一步：定义要输入文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        if (file.exists()){
            //第二步：实例化InputStream类对象
            InputStream inputStream = new FileInputStream(file);
            //第三步：实现数据的读取操作
            byte data [] = new byte[1024];//相当于水杯
            int len = inputStream.read(data);//将数据读取到数组之中
            System.out.println("读取的内容：【" + new String(data, 0, len) + "】");
            //第四步：关闭输入流
            inputStream.close();
        }
    }
}
