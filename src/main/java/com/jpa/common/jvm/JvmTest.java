package com.jpa.common.jvm;

import com.jpa.entity.User;

/**
 * @user zzw
 * @date 2018/11/04 0004
 */
public class JvmTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getClass().getClassLoader());
        System.out.println(user.getClass().getClassLoader().getParent());
        System.out.println(user.getClass().getClassLoader().getParent().getParent());

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("jvm内存总空间：" + maxMemory/1024/1024 + "MB");

        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("jvm内存初始值：" + totalMemory/1024/1024 + "MB");

        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("jvm内存剩余空间：" + freeMemory/1024/1024 + "MB");
    }
}
