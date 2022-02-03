package com.sns.demo;

import java.util.Random;

/**
 * @author sns
 * @create 2022-01-17 5:18
 * Random类。可以生成给定范围的随机数
 * 传入种子
 */
public class Example16_Random类_传入种子 {
    public static void main(String[] args) {
        int flag = 13;
        //生成一个带种子的Random实例，每次生成的结果序列都是相同的
        Random random = new Random();
        //产生10个 0 ~100 之间的随机整数
        for (int i =1; i <= 10; i++) {
            int result = random.nextInt(101);
            System.out.print(result+" ");
        }
        System.out.println();//换行
        System.out.println("-----------------------");

        System.out.println("随机生成一个Boolean值："+random.nextBoolean());
        System.out.println("随机生成double类型的值："+random.nextDouble());
        System.out.println("随机生成float类型的值："+random.nextFloat());
        System.out.println("随机生成int类型的值："+random.nextInt());
        System.out.println("在0 ~ 指定的范围之内随机生成int类型00000000000000000000000000的值："+random.nextInt(100));
        System.out.println("随机生成long类型的值："+random.nextLong());
    }
}
