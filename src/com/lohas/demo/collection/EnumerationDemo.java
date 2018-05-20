package com.lohas.demo.collection;

import java.util.*;

/**
 * Created by Administrator on 2018/5/6.
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Luffy");
        vector.add("lucy");
        vector.add("Jack");
        vector.add("Tom");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            String str = enumeration.nextElement();//避免了转型
            System.out.print(str + "、");
        }
    }
}
