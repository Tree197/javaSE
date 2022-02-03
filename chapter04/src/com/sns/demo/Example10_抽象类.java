package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 10:33
 *
 * 抽象类的练习
 */

//定义测试类
public class Example10_抽象类 {
    public static void main(String[] args) {
        Dog10 dog10 = new Dog10();
        dog10.shout();
    }
}


//定义抽象类
abstract class Animal10{
    //定义抽象方法 shout()
    abstract void shout();
}

//定义Dog10 类继承抽象类Animal10
class Dog10 extends Animal10{
    //实现抽象方法
    void shout(){
        System.out.println("汪汪...");
    }
}