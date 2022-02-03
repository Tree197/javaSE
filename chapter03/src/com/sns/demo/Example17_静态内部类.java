package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 10:15
 * 静态内部类 ：
 */
public class Example17_静态内部类 {
    public static void main(String[] args) {
        //使用外部类名.的方式创建内部类对象
        Outer17.Inner17 inner = new Outer17.Inner17();
        inner.show();

    }
}


class Outer17{
    private static int num = 6;

    //创建静态内部类
    static class Inner17{
        static int x = 4;
        int c =111;
        void show(){
            System.out.println("num="+num+x+c);
        }
    }
}