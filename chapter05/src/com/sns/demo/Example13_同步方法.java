package com.sns.demo;

import sun.security.krb5.internal.Ticket;

/**
 * @author sns
 * @create 2022-01-13 9:17
 * 同步方法
 */
public class Example13_同步方法 {
    public static void main(String[] args) {
        Ticket13 ticket13 = new Ticket13();

        //创建4个线程
        new Thread(ticket13,"窗口1").start();
        new Thread(ticket13,"窗口2").start();
        new Thread(ticket13,"窗口3").start();
        new Thread(ticket13,"窗口4").start();
    }
}


//创建售票类
class Ticket13 implements Runnable {
    private int ticket = 10;    //10张票
    public void run(){
        while (true){
            saleTicket();       //调用售票方法
            if (ticket <= 0){
                break;      //跳出循环
            }
        }
    }

    //定义同步方法
    private synchronized void saleTicket() {
        //判断还有没有票
        if(ticket > 0){
            try {
                Thread.sleep(10);   //线程进来先休息一会
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            String winName = Thread.currentThread().getName();//获取当前线程的名字
            System.out.println(winName + "--正在销售第：" + ticket-- + " 张票");
        }
    }
}