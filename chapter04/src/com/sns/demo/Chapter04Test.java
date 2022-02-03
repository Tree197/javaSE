package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-10 1:51
 *
 * 一、测试静态方法中的变量是否一定为静态变量
 * 二、测试类的继承关系中，父类类型变量指向子类对象时，能否调用子类特有方法
 * 三、测试接口实现关系中，父类类型变量指向子类对象能否调用子类中特有的方法
 */
public class Chapter04Test {
    static int b = 3;

    public static void main(String[] args) {
        //测试静态方法中定义变量是否一定为静态变量
        method1();

        //测试类的继承关系中，父类类型变量指向子类对象时，能否调用子类特有方法
        System.out.println("----------------------");
        Animal00 dog00 = new Dog00();
        dog00.shout();
        //dog00.sleep();        //父类类型变量指向子类对象时，不可以调用子类特有的方法

        //测试接口实现关系中，父类类型变量指向子类对象能否调用子类中特有的方法
        System.out.println("----------------------");
        Car00 car = new SmallerCar00();
        car.start();
        SmallerCar00 car00 = (SmallerCar00) car;
        System.out.println("+---------+");
        System.out.print("|");
        System.out.println(car00.stop("汽车停止了") +"|");
        //car00.stop();         //父类类型变量指向子类对象时，不可以调用子类特有的方法
        System.out.println("+---------+");
    }

    /*
       一：
        测试静态方法中定义变量是否一定为静态变量     结果：定义的变量可以不为静态变量，但是
                                                      静态方法中引用的局部变量必须为静态的
     */
    public static void method1(){
        int a = b + 1;
        System.out.println(a);
    }
}


/**
 * 二：
 * 测试类的继承关系中，父类类型变量指向子类对象时，能否调用子类特有方法
 * 结果：父类类型变量指向子类对象时，不可以调用子类特有的方法
 */
class Animal00{
    public void shout(){
        System.out.println("动物叫");
    }
}

class Dog00 extends Animal00 {
    //这是子类特有的方法
    public void sleep(){
        System.out.println("狗睡觉了");
    }
}


/**
 * 三：
 * 测试接口实现关系中，父类类型变量指向子类对象能否调用子类中特有的方法
 * 结果：不可以
 */
interface Car00{
    void start();
}

class SmallerCar00 implements Car00{       //小汽车
    public void start(){
        System.out.println("小汽车启动了");
    }

    //小汽车特有的方法
    public void stop(){
        System.out.println("小汽车停止了");
    }

    //小汽车特有的方法
    public String stop(String str){
        return str;
    }
}