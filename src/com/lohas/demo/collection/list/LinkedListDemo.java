package com.lohas.demo.collection.list;

import java.util.LinkedList;

/**
 * Created by Administrator on 2018/5/6.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Luffy");
        ll.add("lucy");
        ll.addFirst("Frist");
        ll.addLast("last");
        ll.push("push");
        //弹出
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll.size());
        System.out.println(ll);
    }
}
