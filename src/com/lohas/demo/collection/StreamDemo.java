package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/5/9.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Luffy");
        list.add("Lucy");
        list.add("MJ");
        list.add("ZARD");

        //过滤
//        Stream<String> stream = list.stream().filter(x -> x.contains("L"));
//        //统计个数
//        System.out.println(stream.count());//2

        //收集过滤后的数据
//        List<String> list1 = list.stream().filter(x -> x.contains("L")).collect(Collectors.toList());
        //输出
//        System.out.println(list1);//[Luffy, Lucy]
        //转换成大写再过滤
//        List<String> list1 = list.stream().map((x) -> x.toUpperCase()).filter(x -> x.contains("L")).collect(Collectors.toList());
//        //输出
//        System.out.println(list1);//[LUFFY, LUCY]
        list.add("lohas");
        list.add("lucky");
        list.add("lulu");
        //分页，分页前的结果：[LUFFY, LUCY, LOHAS, LUCKY, LULU]
        //分页后的结果：[LOHAS, LUCKY]
        List<String> list1 = list.stream().map((x) -> x.toUpperCase()).filter(x -> x.contains("L")).skip(2).limit(2).collect(Collectors.toList());
        //输出
        System.out.println(list1);//[LOHAS, LUCKY]


    }
}
