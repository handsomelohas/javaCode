package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/5/6.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Luffy");
        list.add("lucy");
        list.add("Jack");
        list.add("Tom");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String str = iter.next();//避免了转型
            if ("lucy".equals(str)){
                //删除元素，如果lucy后面有两个以上的元素，这个会报错
                //Exception in thread "main" java.util.ConcurrentModificationException
//                list.remove(str);
                iter.remove();//这个正常
            } else{
                System.out.println(str);
            }
        }
    }
}
