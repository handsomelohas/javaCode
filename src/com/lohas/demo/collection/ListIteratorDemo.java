package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2018/5/6.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Luffy");
        list.add("lucy");
        list.add("Jack");
        list.add("Tom");

        ListIterator<String> iter = list.listIterator();

        System.out.print("由前向后迭代：");
        while (iter.hasNext()){
            String str = iter.next();//避免了转型
            System.out.print(str + "、");
        }

        System.out.print("\n由后向前迭代：");
        while (iter.hasPrevious()){
            String str = iter.previous();//避免了转型
            System.out.print(str + "、");
        }

    }
}
