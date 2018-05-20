package com.lohas.demo.reflect;

/**
 * Created by Administrator on 2018/4/22.
 */

interface Fruit {
    public void eat();
}
class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}
class Factory {
    public static Fruit getInstance(String className){
//        if ("apple".equalsIgnoreCase(className)){
//            return new Apple();
//        }
        //用反射来优化

        try {
            return (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class ReflectFactoryDemo {

    public static void main(String[] args) {
//        Fruit fruit = Factory.getInstance("apple");
        Fruit fruit = Factory.getInstance("com.lohas.demo.reflect.Apple");
        fruit.eat();//eat apple

    }

}
