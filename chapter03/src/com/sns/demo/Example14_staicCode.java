package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 6:05
 *
 * static 静态代码块在类加载的时候被自动触发，而且只会执行一次
 */
public class Example14_staicCode {
    static{
        System.out.println("Example14_staticCode中的静态代码执行了...");
    }

    //程序入口
    public static void main(String[] args) {
        //创建两个对象
        Person14 p1 = new Person14();
        Person14 p2 = new Person14();

    }
}

class Person14{
    static {
        System.out.println("Person14中的静态代码执行了...");
    }

}