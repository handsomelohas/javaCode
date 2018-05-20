package com.lohas.demo.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/1.
 */
public class FileDemo1 {

    public static void main(String[] args) throws IOException {
        //列出目录下的文件的路径
        File file = new File("C:" + File.separator + "demoIO");
        print(file);
    }
    public static void print(File file){
        if (file.isDirectory()){
            File[] result = file.listFiles();
            //因为有一些目录没权限进行看的，所以要判断
            if (result != null){
                for (int i = 0; i < result.length; i++) {
                    print(result[i]);
                }
            }
        }
        System.out.println(file);
        //这个是删除
//        file.delete();
    }
}
