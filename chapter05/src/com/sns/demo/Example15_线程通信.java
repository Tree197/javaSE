package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-14 5:23
 * 多线程通信:
 *  使用的是Object类的wait() 方法使线程挂起
 *  notify()方法来唤醒线程
 */
public class Example15_线程通信 {
    public static void main(String[] args) {
         Storage st = new Storage(); //创建仓库对象
        new Thread(new MyThreadInPutDate(st),"存数据").start();
        new Thread(new MyThreadOutPutDate(st),"取数据").start();
    }
}


//定义存数据线程
class MyThreadInPutDate implements Runnable {
    private Storage st; //传入仓库对象
    public MyThreadInPutDate(Storage st){      //构造方法接受仓库对象
        this.st = st;
    }

    //存方法
    public void run(){
        while (true){
            st.inPut();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
//定义取数据线程类
class MyThreadOutPutDate implements Runnable {
    private Storage st;
    public MyThreadOutPutDate(Storage st){      //构造方法接受仓库对象
        this.st = st;
    }
    //取方法
    public void run(){
        while (true){
            st.outPut();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//定义存储类
class Storage {
    private int[] warehouse = new int[10];
    private int inPutDate;      //输入数据
    private int inIndex,outIndex;       //数组存储的下标索引
    private int count;      //存储计数器

    //存方法
    public synchronized void inPut() {
        try {
            while (count == warehouse.length){
                this.wait();        //线程挂起
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        warehouse[inIndex] =inPutDate;
        System.out.println("warehouse[" + inIndex +"],存入的数据是：" + warehouse[inIndex]);
        inIndex++;         //索引加1
        inPutDate++;    //数据加1
        count++;  //计数器加1
        if (inIndex == warehouse.length){
            inIndex = 0;      //将索引重置为0，也就是数据从0开始存
           this.notify();       //存满数据将程序挂起
        }
    }
    //取方法
    public synchronized void outPut(){
        while (count == 0){
            try {
                this.wait();        //说明已经取到最后一个数据了
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int outDate = warehouse[outIndex];      //取出数据
        System.out.println("warehouse[" + outIndex +"],取出的数据是：" + outDate);
        outIndex++;  //索引+1
        count--;
        if (outIndex == warehouse.length){
            outIndex = 0;      //将索引重置为0，也就是数据从0开始取
            this.notify();
        }
    }
}