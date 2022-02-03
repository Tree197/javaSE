package com.sns.demo;

import java.util.Calendar;
import java.util.Date;

/**
 * @author sns
 * @create 2022-01-18 5:42
 * Calendar类的使用,该类是一个抽象类，需要通过getInstance()方法来获得它的实例
 */
public class Example23_Calendar类 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println("当前时间是："+time);
        System.out.println("-------下边是单个字段拼接-----");

        //获取年 -月-日-时-分-秒 单个字段的值
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get((Calendar.MONTH) + 1);
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前时间是："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");

    }
}
