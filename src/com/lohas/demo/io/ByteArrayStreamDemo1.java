package com.lohas.demo.io;

import java.io.*;

/**
 * Created by Administrator on 2018/5/5.
 */
public class ByteArrayStreamDemo1 {

    public static void main(String[] args) throws Exception {
       String path = "C:" + File.separator + "demoIO";
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String fileNames[] = new String[]{"a.txt", "b.txt"};

        for (int i = 0; i < fileNames.length; i++) {
            InputStream inputStream = new FileInputStream(path + File.separator + fileNames[i]);
            int temp = 0;
            while ((temp = inputStream.read()) != -1){
                bos.write(temp);//内存中保存
            }
            inputStream.close();
        }

        OutputStream outputStream = new FileOutputStream(path + File.separator + "c.txt");
        //输出的操作上是不方便的，因为只能够输出字节数组
        outputStream.write(new String(bos.toByteArray()).toUpperCase().getBytes());
        outputStream.close();
        bos.close();
    }

}
