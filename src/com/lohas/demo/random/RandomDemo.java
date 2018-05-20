package com.lohas.demo.random;

import java.util.Random;

/**
 * Created by Administrator on 2018/4/21.
 */
public class RandomDemo {

    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(567);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100) + "、");
        }

    }

}
