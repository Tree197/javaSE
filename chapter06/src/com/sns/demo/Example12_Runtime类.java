package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-16 12:53
 * 这是一个单例的类，它封装了JVM虚拟机的进程
 */
public class Example12_Runtime类 {
    public static void main(String[] args) throws Exception{
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器的个数："+runtime.availableProcessors()+"个");
        System.out.println("空闲内存数量："+ runtime.freeMemory()/1024/1024+"m");
        System.out.println("最大可用内存："+ runtime.maxMemory()/1024/1024+"m");
        //打开计算器
        Process process = runtime.exec("notepad.exe");  //process对象代表一个进程
        Thread.sleep(3000); //3秒后结束该进程
        process.destroy();
    }
}
