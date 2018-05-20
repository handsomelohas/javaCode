package com.lohas.demo.runtime;

/**
 * Created by Administrator on 2018/3/31.
 */
public class RuntimeDemo {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();//取得Runtime类的实例化对象
        System.out.println("freeMemory: " + runtime.freeMemory() + ",单位（M）:" + runtime.freeMemory()/1024/1024);
        System.out.println("totalMemory: " + runtime.totalMemory() + ",单位（M）:" + runtime.totalMemory()/1024/1024);
        System.out.println("maxMemory: " + runtime.maxMemory() + ",单位（M）:" + runtime.maxMemory()/1024/1024);

        String str = "";
        for (int i = 0; i < 3000; i++) {
            str += i;
        }

        System.out.println("----生产对象后的内存---");
        System.out.println("freeMemory: " + runtime.freeMemory() + ",单位（M）:" + runtime.freeMemory()/1024/1024);
        System.out.println("totalMemory: " + runtime.totalMemory() + ",单位（M）:" + runtime.totalMemory()/1024/1024);
        System.out.println("maxMemory: " + runtime.maxMemory() + ",单位（M）:" + runtime.maxMemory()/1024/1024);

        runtime.gc();

        System.out.println("----垃圾回收后的内存---");
        System.out.println("freeMemory: " + runtime.freeMemory() + ",单位（M）:" + runtime.freeMemory()/1024/1024);
        System.out.println("totalMemory: " + runtime.totalMemory() + ",单位（M）:" + runtime.totalMemory()/1024/1024);
        System.out.println("maxMemory: " + runtime.maxMemory() + ",单位（M）:" + runtime.maxMemory()/1024/1024);

    }

}
