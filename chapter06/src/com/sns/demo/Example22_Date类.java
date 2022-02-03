package com.sns.demo;

import java.util.Date;

/**
 * @author sns
 * @create 2022-01-18 5:30
 * 练习Data类的创建
 * 大多方法都已经过时，只有以下两个构造建议使用
 */
public class Example22_Date类 {
    public static void main(String[] args) {
        Date date1 = new Date();        //表示当前时间对象
        Date date2 = new Date(1639906000000L);  //创建表示时间戳的Date对象
        System.out.println("当前时间："+date1);
        System.out.println("从1970年到52年后的时间是："+date2);
    }
}
