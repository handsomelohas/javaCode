package com.lohas.demo.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/5/6.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("lucy");
        set.add("luffy");
        set.add("java");
        set.add("python");
        set.add("luffy");//重复元素，不保存
        System.out.println(set);
    }
}
