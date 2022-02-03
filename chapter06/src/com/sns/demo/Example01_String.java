package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-15 2:33
 * //String类的初始化
 */
//String类的创建方式
public class Example01_String {
    public static void main(String[] args) {
        String str1 = new String();     //创建一个空的字符串
        String str2 = new String("abcd");   //通过构造方法生成一个字符串
        char[] ch = new char[]{'E','F','G'};
        String str3 = new String(ch);
        String str4 = "我是字符串";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}


