package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-12 1:26
 * 自定义异常： 1.需要继承Example类或其子类，需要调用父类的无参以及有参构造方法
 */
public class Example27_自定义异常2 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            newException(arr);
//中文是粗细不均的问题
        }catch (MyException e){
            e.printStackTrace();
        }

    }

    //制造一个会导致异常的方法
    public static void newException(int[] arr) throws MyException{
        //如果数组长度小于3 ，抛出异常,否则打印出该数组的长度
        if(arr.length < 3){
            throw new MyException("该数组长度小于3 位。");
        }
        System.out.println("该数组的长度为：" + arr.length);
    }
}


//自定义异常类
class MyException extends Exception {
    //需要重写父类的构造方法
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}



