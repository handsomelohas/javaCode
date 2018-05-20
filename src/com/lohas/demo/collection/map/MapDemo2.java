package com.lohas.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/8.
 */
class Cat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
public class MapDemo2 {
    public static void main(String[] args) {
        //Cat 没有覆写Object类中的hashCode()与equals()两个方法，结果：null
        //覆写后，结果：Cat
        Map<Cat,String> map = new HashMap<Cat,String>();
        map.put(new Cat("Kitty"), new String("Cat"));
        System.out.println(map.get(new Cat("Kitty")));//null

        //String 有覆写Object类中的hashCode()与equals()两个方法
        Map<String,Cat> map1 = new HashMap<String,Cat>();
        map1.put(new String("cat"),new Cat("Kitty"));
        System.out.println(map1.get(new String("cat")));//Cat{name='Kitty'}
    }
}
