package com.lohas.demo.io.copydemo;

import java.io.*;

/**
 * Created by Administrator on 2018/5/3.
 */
public class CopyMain {
    public static void main(String[] args) throws Exception{
        //如果要执行拷贝命令，则必须通过初始化参数传递源文件以及目标文件路径
        if (args.length != 2){
            System.out.println("错误命令，格式为:CopyMain 源文件路径 目标文件路径");
            System.exit(1);
        }
        //如果现在有参数了，那么还需要验证源文件是否存在
        File inFile = new File(args[0]);
        if (!inFile.exists()){
            System.out.println("路径错误，请确定源文件路径正确。");
            System.exit(1);
        }
        //如果拷贝文件存在，也不应该进行拷贝
        File outFile = new File(args[1]);
        if (outFile.exists()){
            System.out.println("拷贝的路径文件已经存在，请更换路径");
            System.exit(1);
        }

        long startTime = System.currentTimeMillis();
        InputStream in = new FileInputStream(inFile);
        OutputStream out = new FileOutputStream(outFile);
        copy(in, out);//开始实现拷贝
        in.close();
        out.close();
        long endTime = System.currentTimeMillis();
        System.out.println("花费的时间：" + (endTime - startTime));
    }

    public static void copy(InputStream input, OutputStream output) throws Exception{
        //初始版的用时：花费的时间：3632
//        int temp = 0;//保存每次读取的字节量
//        while ((temp = input.read()) != -1){//每个字节读取
//            output.write(temp);
//        }
        //优化版：花费的时间：0
        int temp = 0;//保存每次读取的字节量
        byte data [] = new byte[2048];
        while ((temp = input.read(data)) != -1){//每次读取固定的数组（读入到data数组）
            output.write(data,0, temp);//temp是读取的长度，所以写出的长度是temp
        }
    }
}
