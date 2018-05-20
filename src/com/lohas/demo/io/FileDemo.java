package com.lohas.demo.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2018/4/30.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //在设置路径的时候，并不会判断文件的具体内容(C:/demoIO/demo.txt也能用)
//        File file = new File("C:" + File.separator + "demoIO""demo.txt");//要操作C盘demoIO的demo.txt文件
        //这个才是正确的因为windows和linux的路径分割符不一样
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "demo.txt");
        //此时就可以非常方便的实现指定路径的操作
        if (!file.getParentFile().exists()){//父路径不存在
            file.getParentFile().mkdirs();//创建父目录
        }
        if (file.exists()){
            file.delete();
        } else {
            System.out.println(file.createNewFile());
        }
        System.out.println("---------------");
        File file1 = new File("C:" + File.separator + "demoIO" + File.separator + "TS.jpg");
        if (file1.exists()){
            System.out.println("是否目录？：" + file1.isDirectory());
            System.out.println("是否文件？：" + file1.isFile());
            if (file1.isFile()){
                System.out.println("文件大小：" + new BigDecimal((double) file1.length() / 1024 / 1024).divide(new BigDecimal(1),2, BigDecimal.ROUND_HALF_UP) + "M");
                System.out.println("最近修改日期：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file1.lastModified()));

            }
        }
        System.out.println("---------------");
        File file2 = new File("C:" + File.separator + "demoIO" + File.separator);
        if (file2.exists() && file2.isDirectory()){
            String[] str = file2.list();
            File[] result = file2.listFiles();
            System.out.println("文件名如下：");
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
            System.out.println("文件如下：");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }

            File[] filter = file2.listFiles(new FilenameFilter(){
                @Override
                public boolean accept(File dir, String name) {
                    return name.matches("[^0-9]+");
                }
            });
            System.out.println("过滤文件名为数字如下：");
            for (int i = 0; i < filter.length; i++) {
                System.out.println(filter[i]);
            }

        }
    }
}
