package com.lohas.demo.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2018/5/6.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "first");
        map.put(2, "second");
        //如果key重复，会替换旧的value的值
        map.put(2, "second111");
        map.put(3, "third");
        map.put(0, null);
        map.put(null, "empty");
        System.out.println(map);//{0=null, null=empty, 1=first, 2=second, 3=third}
        System.out.println(map.get(1));//first
        System.out.println(map.get(2));//second111(已覆盖)
        System.out.println(map.get(0));//null
        System.out.println(map.get(null));//empty
        //输出所有的key
        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + "、");//0、null、1、2、3、
        }

    }
}
