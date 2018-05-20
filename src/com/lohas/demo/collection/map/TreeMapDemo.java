package com.lohas.demo.collection.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2018/5/6.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "luffy");
        map.put(9, "lucy");
        map.put(6, "lohas");
        map.put(15, "MJ");
        System.out.println(map);//{1=luffy, 6=lohas, 9=lucy, 15=MJ}
    }
}
