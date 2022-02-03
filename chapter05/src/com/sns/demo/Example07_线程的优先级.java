package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 12:38
 * Thread类中提供有三个常量来表示线程的优先级分别是
 * MAX_PRIORITY(10最高优先级），MIN_PRIORITY(1最小优先级），NORM(5普通优先级）
 * main方法就是NORM 普通优先级
 *
 * 可以调用setPriority()方法来设置线程优先级，传入1~10的参数
 */
public class Example07_线程的优先级 {
    public static void main(String[] args) {
        Thread max = new Thread(new MaxPriority(), "较高优先级的线程");
        Thread min = new Thread(new MinPriority(), "较低优先级的线程");

        //分别设置线程优先级
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        //开启线程
        max.start();
        min.start();

    }
}

//较高优先级的线程
class MaxPriority implements Runnable {
    public void run(){
        //for循环
        for (int i = 1; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

//较低优先级的线程
class MinPriority implements Runnable {
    public void run(){
        //for循环
        for (int i = 1; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}