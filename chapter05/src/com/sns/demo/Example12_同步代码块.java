package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-13 8:44
 */
public class Example12_同步代码块 {
    public static void main(String[] args) {
        Ticket12 ticket12 = new Ticket12();
        //创建4个窗口并开启
        new Thread(ticket12,"窗口1").start();
        new Thread(ticket12,"窗口2").start();
        new Thread(ticket12,"窗口3").start();
        new Thread(ticket12,"窗口4").start();
    }
}

//售票窗口
class Ticket12 implements Runnable {
    private int ticket = 100;  //10张票
    Object obj = new Object(); //锁对象
    public void run(){
        while (true){
            synchronized (obj){     //同步代码块
                try {
                    Thread.sleep(10);       //线程休息10毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //判断当前余票
                if (ticket > 0){
                    String winName = Thread.currentThread().getName();      //获取当前窗口名字
                    System.out.println(winName + "--正在销售第：" + ticket-- +"张票");  //打印当前售票并减1
                }else {
                    break;
                }
            }
        }
    }
}
