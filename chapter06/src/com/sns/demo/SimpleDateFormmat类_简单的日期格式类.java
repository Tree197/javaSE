package com.sns.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sns
 * @create 2022-01-19 5:00
 * 该类是DateFormat的子类，使用方法比DateFormat更灵活
 */
public class SimpleDateFormmat类_简单的日期格式类 {
    public static void main(String[] args) throws Exception{
        //自定义格式
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(
                "今天是: Gyyyy 年 MM 月 dd 日 a:hh:mm:ss, 是今年的第 DD 天 "+
                        ", 第 w 周");
        System.out.println(simpleDateFormat1.format(new Date()));    //打印输出自定义格式的当前时间
        //--------------------------

        //自定义格式解析字符串类型
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
        String str = "2010/6/26";
        System.out.println(simpleDateFormat2.parse(str));

    }
}
