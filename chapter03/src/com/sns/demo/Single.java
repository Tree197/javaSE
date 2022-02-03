package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 6:24
 * Single单例模式
 */
public class Single{
    private static Single INSTANCE = new Single();
    //私有化构造方法
    private Single(){};
    //提供返回对象的公共方法
    public static Single getInstance(){
        return INSTANCE;
    }
}