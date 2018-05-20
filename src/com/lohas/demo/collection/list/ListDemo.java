package com.lohas.demo.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/5/6.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hello");//重复的元素
        list.add("Lohas");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("================");
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******collection,以下代码了解一下就行*********");
        Collection<String> collection = new ArrayList<String>();
        collection.add("Hello1");
        collection.add("Hello1");//重复的元素
        collection.add("Lohas1");
        //Collection没有get(int index)的方法,但是可以转换成数组再输出
        Object obj [] = collection.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println("================");
        Iterator<String> iterator1 = collection.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
