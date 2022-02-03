package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-17 11:56
 * 练习int类装箱成Integer 类的过程
 */
public class Example19_Integer装箱or拆箱 {
    public static void main(String[] args) {

        //装箱：将int类型的值转换为Integer类型
        int a = 10;
        Integer integer = new Integer(a);
        System.out.println(integer.toString());

        //拆箱：将Integer类型的值转换为int类型
        Integer num = new Integer(20);
        int b = 10;
        int sum = b + num.intValue();
        System.out.println("sum="+sum);
    }
}
