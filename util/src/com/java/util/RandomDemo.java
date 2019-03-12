package com.java.util;

import java.util.Random;

/**
 * 随机数程序
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
