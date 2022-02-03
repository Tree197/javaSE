package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 11:29
 * 类的继承，关键字extends
 */
public class Example05_Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}


class Animal05{
    public Animal05(){
        System.out.println("动物叫了...");
    }
    public Animal05(String name){
        System.out.println(name + "叫了...");
    }

    public void sleep(){
        System.out.println("动物睡觉了");
    }
}

class Dog extends Animal05 {
    public Dog(){
        super();
        System.out.println("这里是狗狗的构造方法...");
        super.sleep();
    }
    void shout(){
//        System.out.println("狗狗睡觉了");
//        super.sleep();
//        super.sleep();
    }

}