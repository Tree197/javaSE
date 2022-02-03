package com.sns.demo;

import java.util.Random;

/**
 * @author sns
 * @create 2022-01-17 5:18
 * Random类。可以生成给定范围的随机数
 */
public class Example16_Random类_不传入种子 {
    public static void main(String[] args) {
        Random random = new Random();
        //产生10个 0 ~100 之间的随机整数
        for (int i =1; i <= 10; i++){
            int result = random.nextInt(101);
            System.out.println(i + ":" + result);
        }
    }
}
