package com.jpa.common.jvm;

/**
 * @user zzw
 * @date 2018/11/04 0004
 */
public class StackTest {
    private static int count = 0;
    //方法递归调用
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        try {
            Thread.sleep(1000);
            System.out.println("****************************" + count++);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print();
    }
}
