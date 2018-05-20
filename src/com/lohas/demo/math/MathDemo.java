package com.lohas.demo.math;

/**
 * Created by Administrator on 2018/4/21.
 */
class MyMath{
    /**
     * 实现数字的四舍五入方法
     * @param num 要进行四舍五入的数字
     * @param scale 保留的小数位
     * @return 四舍五入后数字
     */
    public static double round(double num, int scale){
        return Math.round(num * Math.pow(10.0, scale)) / Math.pow(10.0, scale);
    }
}
public class MathDemo {
    public static void main(String[] args) {

        System.out.println(MyMath.round(13232.7211, 2));//100000.0


    }
}
