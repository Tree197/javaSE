package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 11:29
 * 使用Runnable接口的方式 来进行售票
 * 100张票，4个窗口在销售，售完为止
 */
public class Example04_Runnable_多线程售票例子 {
    public static void main(String[] args) {
        //使用runnable方法进行售票
        TicketWindow04 tw = new TicketWindow04();
        //开启四条线程
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
    }
}


//创建窗口
class TicketWindow04 implements Runnable {
    private  int ticket = 100; //100张票
    Object lock = new Object();//创建锁头
    public void run() {
        while (ticket>0){
            //增加同步代码块
            synchronized (lock){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //判断是否还有余票
                if (ticket > 0) {
                    String window = Thread.currentThread().getName();  //获取售票窗口名字
                    System.out.println(window + " --正在销售第：" + ticket + " 张票");
                    ticket--;
                } else {
                    System.out.println(Thread.currentThread().getName()+"--非常抱歉，该车次的车票已经售空！");
                   // return;
                }
            }
        }
    }
}