package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 10:52
 * 接口之间的继承关系
 */
public class Example12_接口 {
    public static void main(String[] args) {
        Dog12 dog12 = new Dog12();
        dog12.liveOnland();
        dog12.breathe();
        dog12.run();
    }
}

//定义Dog12 类实现LandAnimal 接口
class Dog12 implements LandAnimal{
    @Override
    public void breathe() {
        System.out.println("狗在呼吸");
    }

    @Override
    public void run() {
        System.out.println("狗在跑");
    }

    @Override
    public void liveOnland() {
        System.out.println("狗生活在陆地上");
    }
}


//定义 Animal12 接口
interface Animal12{
    int ID = 1;
    void breathe();     //呼吸方法
    void run();         //奔跑
}

//定义 LandAnimal（陆栖动物）接口，并继承了 Animal12 接口
interface LandAnimal extends Animal12{
    void liveOnland();
}