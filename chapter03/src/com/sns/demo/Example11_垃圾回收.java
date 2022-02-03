package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 4:22
 * 垃圾回收：垃圾回收是java特有的机制，闲置的对象会被回收，回收时会调用对象的finalize()方法
 * 手动调用垃圾回收器的方法是System.gc();
 * 垃圾回收器会随着程序结束而终止
 * finalize() 方法返回值必须为void ,并且要使用public 来修饰
 */
public class Example11_垃圾回收 {
    public static void main(String[] args) {
        Person3 person3 = new Person3();
        person3 = null;
        System.gc();        //调用垃圾回收器
        //延长程序时间
        for(int i = 0; i<10000000; i++){

        }
    }
}

class Person3{
    public void finalize(){
        System.out.println("该对象即将要被回收...");
    }
}
