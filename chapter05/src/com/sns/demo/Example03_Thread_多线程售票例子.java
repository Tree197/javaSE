package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 11:03
 * 售票厅有4个售票窗口，同时分发100张火车票
 * Thread类售票有弊端
 */
public class Example03_Thread_多线程售票例子 {
    public static void main(String[] args) {
        //创建售票窗口
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
    }
}

/**
 * TicketWindow --售票窗口
 */
class TicketWindow extends Thread {
    private static int ticket = 100;  //100火车票
    public void run(){
        while (true){
            //判断如果还有票就卖,要显示是哪一个窗口卖出的
            if (ticket > 0 ) {
                String windowName = Thread.currentThread().getName();//获取售票窗口名
                System.out.println(windowName + "正在销售第：" + ticket + " 张票");
                ticket--;
            }else {
                System.out.println("该车次的车票已经全部售空，请明天再来！");
                return;
            }
        }
    }
}
