package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 11:53
 * instanceof关键字 判断一个对象是否为某个类的实例
 */
public class Example15_instanceof关键字 {
    public static void main(String[] args) {
        //判断猫是否是狗的实例
        Cat15 cat = new Cat15();
        Dog15 dog = new Dog15();
        System.out.println("cat对象是不是 Cat15的实例：" + (cat instanceof Cat15));
        System.out.println(cat instanceof Object);

    }

}

class Cat15{

}

class Dog15{

}