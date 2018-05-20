package com.lohas.demo.bigInteger;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/4/21.
 */
public class BigIntegerDemo {

    public static void main(String[] args) {

        BigInteger bigA = new BigInteger("405985959458437323");
        BigInteger bigb = new BigInteger("4059859");
        System.out.println("加法操作：" + bigA.add(bigb));
        System.out.println("减法操作：" + bigA.subtract(bigb));
        System.out.println("乘法操作：" + bigA.multiply(bigb));
        System.out.println("除法操作：" + bigA.divide(bigb));
        BigInteger[] result = bigA.divideAndRemainder(bigb);
        System.out.println("除法操作，商：" + result[0] + " 余数：" + result[1]);

    }

}
