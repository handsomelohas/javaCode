package com.lohas.demo.collection;

import java.util.Stack;

/**
 * Created by Administrator on 2018/5/8.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Lucy");
        stack.push("Lohas");
        stack.push("Luffy");
        System.out.println(stack);//[Lucy, Lohas, Luffy]
        System.out.println(stack.pop());//Luffy
        System.out.println(stack.pop());//Lohas
        System.out.println(stack.pop());//Lucy
        System.out.println(stack.pop());//java.util.EmptyStackException
    }
}
