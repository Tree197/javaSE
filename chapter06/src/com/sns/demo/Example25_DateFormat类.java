package com.sns.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


/**
 * @author sns
 * @create 2022-01-19 4:13
 * 这个类专门用来对日期时间类 格式显示风格进行自定义DIY
 * DateFormat类是抽象类，用getDateInstance()方法可以获得他的对象
 * 该类中有4个常量作为参数对应不同的时间风格显示
 * 1.FULL(完整时间格式)  2.LONG(长格式)  3.MEDIUM（普通格式） 4.SHORT(短格式)
 */
public class Example25_DateFormat类 {
    public static void main(String[] args) throws ParseException {
        //创建Date类
        Date date = new Date();
        //完整格式
        DateFormat fullInstance = DateFormat.getDateInstance(DateFormat.FULL);
        //长格式
        DateFormat longInstance = DateFormat.getDateInstance(DateFormat.LONG);
        //普通格式
        DateFormat mediumInstance = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        //短格式
        DateFormat shortInstance = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

        //分别将日期格式化并且输出
        System.out.println("完整格式："+fullInstance.format(date));
        System.out.println("长格式："+longInstance.format(date));
        System.out.println("普通格式："+mediumInstance.format(date));
        System.out.println("短格式："+shortInstance.format(date));

        System.out.println("----------分割线------------");

        //练习parse()方法，该方法可以将特定格式的字符串转换为Date类型
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        String str = "2010年6月26日";
        Date parse = df.parse(str);     //将字符串解析成date对象

        System.out.println(parse);      //打印为格式化的日期
        System.out.println(df.format(parse));       //打印格式化后的日期
    }
}
