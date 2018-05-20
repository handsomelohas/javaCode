package com.lohas.demo.reflect;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2018/4/22.
 */
class People{
    private String name;
}
public class ReflectFieldDemo {

    public static void main(String[] args) {

        try {
            Class<?> cls = Class.forName("com.lohas.demo.reflect.Dog");
            Object object = cls.newInstance();//实例化对象
            Field nameField = cls.getDeclaredField("name");
            //取消封装，否则获取private会报错
            nameField.setAccessible(true);
            nameField.set(object,"Luffy");
            System.out.println(nameField.get(object));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
