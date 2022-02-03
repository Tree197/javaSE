package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 11:48
 * 新创建的线程为前台线程，只有在线程启动前调用setDaemon(true)方法，才可以使该线程成为后台线程
 * 当一个程序中所有前台线程都结束以后，后台线程也会随之结束,程序终止
 */
public class Example06_后台线程 {
    public static void main(String[] args) {
        System.out.println("main是后台线程吗？" + Thread.currentThread().isDaemon());
        Thread daemonThread = new Thread(new DaemonThread(), "后台线程");
        System.out.println(daemonThread.getName()+ "默认是后台线程吗？:" + daemonThread.isDaemon());
        daemonThread.setDaemon(true);       //设置为后台线程
        daemonThread.start();   //开启线程
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }
    }
}

//创建一个线程类
class DaemonThread implements Runnable {
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName() + "---正在运行");
            try {
                Thread.sleep(1000);
            } catch(Exception e){

            }
        }
    }
}
