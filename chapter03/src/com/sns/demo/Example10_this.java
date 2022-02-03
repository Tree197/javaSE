package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 4:04
 * this 关键字
 *  特点:指的是当前对象，this调用构造方法时，只能位于第一行,只能在构造方法中调用构造方法
 */
public class Example10_this {
    public static void main(String[] args) {
        Person2 person2 = new Person2(18);

    }
}

class Person2{
    public Person2(){
        System.out.println("我是无参构造方法，我被创建了");
    }

    public Person2(int age){
        this();
        System.out.println("我今年"+age+"岁了");
    }
}
