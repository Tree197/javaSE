package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 11:23
 *
 * 多态的练习：多态是指 使用父类类型变量引用子类对象
 *
 */

//测试多态
public class Example13_多态 {
    public static void main(String[] args) {
        //创建猫狗对象
        //Dog13 dog = new Dog13();
        //Cat13 cat = new Cat13();
        Animal13 cat = new Cat13();
        Animal13 dog = new Dog13();
        Cat13 cat2 = (Cat13) cat;


        cat2.sleep();
        //调用动物叫方法实现多态
        animalShout(dog);
        animalShout(cat);
    }

    //定义一个方法，功能是 传入什么类型的动物就发物对应动物叫声
    public static void animalShout(Animal13 animal){
        animal.shout();
    }
}



//定义猫类实现动物接口
class Cat13 implements Animal13{
    public void shout(){
        System.out.println("喵喵...");
    }
    public void sleep(){
        System.out.println("猫在睡觉");
    }
}

//定义狗类实现动物接口
class Dog13 implements Animal13{
    public void shout(){
        System.out.println("汪汪...");
    }
}

//定义Animal13 接口
interface Animal13{
    //抽象方法
    void shout();
}