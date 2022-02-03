package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-10 4:57
 * 练习异常类
 */
public class Example21_异常类 {
    public static void main(String[] args) {
        //调用除法
        /*
        int result = divide(4, 0);      //这条会报错：算术异常
        System.out.println(result);
        */

        //修改以后
        try {
            int res = divide(4, 0);
            System.out.println(res);

        }catch (Exception e){
            System.out.println("报错的原因是：" + e.getMessage()); //打印报错的原因
            return;
        }finally {
            System.out.println("程序进入finally代码块...");
        }

        System.out.println("程序继续向下执行...");
        
    }

    /**
     * divide（除法）
     * 实现两个整数相除并返回结果
     * @param x
     * @param y
     * @return
     */
    public static int divide(int x, int y){
        return x / y;
    }
}


