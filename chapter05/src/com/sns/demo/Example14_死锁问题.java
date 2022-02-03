package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-13 9:42
 *例子：中国人用筷子chopsticks，美国人用刀叉 knife and fork,
 *      如果中国人拿了刀叉，美国人拿了筷子，大家就都无法吃饭
 *
 */
public class Example14_死锁问题 {
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);

        new Thread(d1,"中国人").start();
        new Thread(d2,"美国人").start();
    }

}

class DeadLock implements Runnable {
    //创建两个锁对象
    static Object chopsticks = new Object();       //筷子
    static Object knifeAndFork = new Object();     //刀叉
    private boolean flag;       //定义一个旗帜

    public DeadLock(boolean flag){
        this.flag = flag;
    }

    public void run(){
        if (flag){
            while (true){
                synchronized (chopsticks){      //中国人先用筷子
                    System.out.println(Thread.currentThread().getName() + "中国人需要用筷子");
                    synchronized (knifeAndFork){
                        System.out.println(Thread.currentThread().getName() + "美国人需要用刀叉");
                    }
                }
            }
        }else{
            while (true){
                synchronized (knifeAndFork){    //美国人先用刀叉
                    System.out.println(Thread.currentThread().getName() + "美国人需要用刀叉");
                    synchronized (chopsticks){
                        System.out.println(Thread.currentThread().getName() + "中国人需要用筷子");

                    }
                }
            }
        }
    }
}
