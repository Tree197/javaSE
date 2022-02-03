package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-17 4:24
 * Math类是数学操作类
 */
public class Example15_Math类 {
    public static void main(String[] args) {
        System.out.println("计算绝对值的结果："+Math.abs(-1));
        System.out.println("求大于给定参数的最小整数："+Math.ceil(1.1));
        System.out.println("求小于给定参数的最大整数："+Math.floor(8.9));
        System.out.println("对小数进行四舍五入的结果："+Math.round(2.5));
        System.out.println("求两个数的最大值："+Math.max(6,8));
        System.out.println("求两个数的最小值："+Math.min(6,8));
        System.out.println("生成一个大于等于0.0小于0.9的随机值："+Math.random()*100);

    }
}

