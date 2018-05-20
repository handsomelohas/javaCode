package com.lohas.demo.arrays;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/21.
 */
public class ArraysEqualDemo {

    public static void main(String[] args) {
        int dataA [] = new int[] {1, 2, 3};
        int dataB [] = new int[] {1, 2, 3};
        int dataC [] = new int[] {1, 2, 4};
        int dataD [] = new int[] {1, 3, 2};
        System.out.println(Arrays.equals(dataA, dataB));//true
        System.out.println(Arrays.equals(dataA, dataC));//false
        System.out.println(Arrays.equals(dataA, dataD));//false

        int data [] = new int[] {1, 2, 3};
        Arrays.fill(data, 10);
        System.out.println(Arrays.toString(data));//[10, 10, 10]
    }

}
