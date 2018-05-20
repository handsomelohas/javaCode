package com.lohas.demo.random;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2018/4/21.
 */
public class Random36Demo {

    public static void main(String[] args) {

        int data [] = new int [7];//生成一个数组，保存7个最终的号码
        ch(data);
        Arrays.sort(data);
        print(data);

    }

    public static void print(int temp[]){
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "、");
        }
    }

    public static void ch(int temp[]){
        int foot = 0;//作为数组的操作指标
        Random random = new Random();
        while (foot < 7){
            //选出一个数据
            int num = random.nextInt(37);
            //必须保征数据不能够为0
            if (num != 0){
                if (!isRepeat(temp, num)){
                    temp[foot++] = num;
                }
            }
        }
    }

    /**
     * 判断内容是否存在
     * @param temp 要判断的数组
     * @param num 生成数字
     * @return
     */
    public static boolean isRepeat(int temp[], int num){
        for (int i = 0; i < temp.length; i++) {
            if (num == temp[i]){
                return true;
            }
        }
        return false;
    }

}
