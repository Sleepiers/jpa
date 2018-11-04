package com.jpa.common.jvm;

import java.util.Random;

/**
 * @user zzw
 * @date 2018/11/04 0004
 */
public class OOMTest {
    private static String str = "hello";

    public static void main(String[] args) {
        while (true){
            str += str + new Random().nextInt(99999);
        }
    }
}
