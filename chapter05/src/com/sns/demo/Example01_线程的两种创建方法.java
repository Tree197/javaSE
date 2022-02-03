package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 10:18
 * 凭借记忆写出两种继承线程的方法
 */
public class Example01_线程的两种创建方法 {
    public static void main(String[] args) {
        //开启Thread线程
        new MyThreadExtendsThread().start();
        //开启Runnable线程
        new Thread(new MyThreadImplementsRunnable()).start();
        //调用main主线程
        mainThread();

    }

    //这是main主线程
    public static void mainThread() {
        for (int i = 1; i < 99; i++) {
            System.out.println("这是main主线程：" + i);
        }
    }
}

//方法一：继承Thread类
class MyThreadExtendsThread extends Thread {
    public void run(){
        try {
            //for循环打印aaa
            for (int i = 1; i < 100; i++){
                System.out.println("这是Thread线程：" + i);
                sleep(500); //让线程半秒钟执行一次
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//方法二：实现Runnable接口
class MyThreadImplementsRunnable implements Runnable {
    //实现run（）方法
    public void run(){
        try {
            //for循环打印bbb
            for (int i = 1; i < 100; i++){
                System.out.println("这是Runnable线程：" + i);
                Thread.sleep(500);//让线程半秒钟执行一次
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}