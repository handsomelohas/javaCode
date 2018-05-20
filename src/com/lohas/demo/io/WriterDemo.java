package com.lohas.demo.io;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by Administrator on 2018/5/1.
 */
public class WriterDemo {
    public static void main(String[] args) throws Exception{
        //第一步：定义要输出文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        //输出信息的时候文件可以不存在，但是目录必须存在
        if (!file.getParentFile().exists()){//父路径不存在
            file.getParentFile().mkdirs();//创建父路径
        }

        Writer writer = new FileWriter(file);
        //向文件追加
//        Writer writer = new FileWriter(file, true);
        String msg = "厉害了我的祖国";
        writer.write(msg);//直接输出字符串
        writer.close();

    }
}
