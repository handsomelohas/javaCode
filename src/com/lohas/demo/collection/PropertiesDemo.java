package com.lohas.demo.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        //输出操作
//        properties.setProperty("Luffy","海贼王");
//        properties.setProperty("lucy","girl");
//        System.out.println(properties.getProperty("Luffy"));//海贼王
//        System.out.println(properties.getProperty("lucy"));//girl
//        System.out.println(properties.getProperty("Mj"));//null
//        System.out.println(properties.getProperty("Lohas", "root"));//root
//        //将属性输出到指定输出流中
//        properties.store(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "pro.properties")), "Info");
//        //将属性输出到指定输出流中(xml保存)
//        properties.storeToXML(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "pro.xml")), "xml");

        //输入操作
        //从输入流读取属性信息
        properties.load(new FileInputStream(new File("C:" + File.separator + "demoIO" + File.separator + "pro.properties")));
//        properties.loadFromXML(new FileInputStream(new File("C:" + File.separator + "demoIO" + File.separator + "pro.xml")));
        System.out.println(properties.getProperty("Luffy"));//海贼王
        System.out.println(properties.getProperty("lucy"));//girl
    }
}
