package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 10:22
 * 方法内部类：只能在方法中创建该类的实例
 */
public class Example18_方法内部类 {
    public static void main(String[] args) {
        Outer18 outer18 = new Outer18();
        outer18.test();
    }
}

class Outer18{
    private int num = 10;
    void test(){
        //创建方法内部类
        class Inner18{
            void show(){
                System.out.println("num="+num);
            }
        }
        //只能在方法中创建内部类对象
        Inner18 inner = new Inner18();
        inner.show();
    }
}

