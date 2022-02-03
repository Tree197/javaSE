package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 6:14
 * 单例模式英文（single）
 * //私有化构造方法
 */
public class Example15_单例模式 {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
    }
}


