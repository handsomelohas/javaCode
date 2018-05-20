package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2018/5/9.
 */
public class ForEachDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Luffy");
        list.add("Lucy");
        list.add("MJ");
        list.add("ZARD");
        list.add("MJ");
        //方法引用
        list.forEach(System.out :: println);
        System.out.println("*****************");
        //去掉重复元素
        Stream<String> stream = list.stream().distinct();
        //统计个数
        System.out.println(stream.count());
    }
}
