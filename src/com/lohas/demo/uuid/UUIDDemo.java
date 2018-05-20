package com.lohas.demo.uuid;

import java.util.UUID;

/**
 * Created by Administrator on 2018/4/29.
 */
public class UUIDDemo {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid.toString().replaceAll("-",""));
    }

}
