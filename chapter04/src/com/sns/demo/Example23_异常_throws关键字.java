package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-10 5:21
 * 该关键字是声明某个方法或者类可能会出现异常，调用该类时必须处理异常
 */
public class Example23_异常_throws关键字 {
    public static void main(String[] args)throws Exception {
        //调用声明异常的方法
        int result = divide(5, 0);
        System.out.println(result);
    }

    public static int divide(int x, int y) throws Exception{
        return x / y;
    }
}
