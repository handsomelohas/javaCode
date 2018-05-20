package com.lohas.demo.collection.map;

import java.util.*;

/**
 * Created by Administrator on 2018/5/6.
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "luffy");
        map.put(9, "lucy");
        map.put(6, "lohas");
        map.put(15, "MJ");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iter = set.iterator();
        while(iter.hasNext()){
            Map.Entry<Integer, String> me = iter.next();
            System.out.println(me.getKey() + "=" + me.getValue());
        }

        System.out.println("******************");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
