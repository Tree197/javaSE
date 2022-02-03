package com.sns.demo;

import java.util.Calendar;

/**
 * @author sns
 * @create 2022-01-19 3:39
 * 假设有个工程开工时间为2008年的8月8日，工时100天 后是几月几日？
 */
public class Example24_Calendar类例子练习 {
    public static void main(String[] args) {
        //获得Calendar类
        Calendar calendar = Calendar.getInstance();
        //设置开工日期为2008年8月8日,由于月份从0开始，所以7月等于8月
        calendar.set(2008,7,8);
        //设置为date参数增加100天
        calendar.setLenient(false);     //开启Lenient模式后，将不再支持月份自动进位，例如一个月最多31天，设置为32就会报错
        calendar.set(Calendar.DATE, 8);

        calendar.add(Calendar.DATE, 100);
        //calendar.add(Calendar.DATE, -30);

        //获取日期字段
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);

        System.out.println("100天后竣工日期为：" + year +"年"+ month + "月" + date + "日");

       // System.out.println(calendar.getTime());


    }
}
