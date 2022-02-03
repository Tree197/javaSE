package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-13 7:42
 * 线程插队的方法 join()，这是Thread中的方法
 */
public class Example10_线程插队 {
    public static void main(String[] args)throws Exception {
        //创建两个线程
        Thread t1 = new Thread(new JumpThread(), "线程一");
        t1.start();

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+ i);
            if (i == 2){
                t1.join();      //如果i=2,让t1插队直到执行完毕
            }
            Thread.sleep(500);
        }
    }
}

//创建一个线程类 jump（插队）
class JumpThread implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
