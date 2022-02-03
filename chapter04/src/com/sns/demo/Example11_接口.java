package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 10:44
 * 类与接口之间的实现关系
 */

//定义测试类
public class Example11_接口 {
    public static void main(String[] args) {
        Dog11 dog11 = new Dog11();
        dog11.breathe();
        dog11.run();
    }
}

//定义Animal11 接口
interface Animal11{
    int ID = 1;         //定义全局常量
    void breathe();     //定义抽象方法
    void run();         //定义抽象方法
}


//Dog11 类实现 Animal11 接口
class Dog11 implements Animal11{
    //必须要实现接口中的所有方法
    public void breathe(){
        System.out.println("狗呼吸...");
    }
    public void run(){
        System.out.println("狗在跑...");
    }
}