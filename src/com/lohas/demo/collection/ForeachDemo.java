package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/6.
 */
public class ForeachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Luffy");
        list.add("lucy");
        list.add("Jack");
        list.add("Tom");
        for (String str : list){
            System.out.println(str);
        }
    }
}
