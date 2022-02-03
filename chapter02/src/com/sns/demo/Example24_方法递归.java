package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-02 5:00
 * 方法的递归
 */
public class Example24_方法递归 {
    public static void main(String[] args) {
        int sum = getSum(3);
        System.out.println("sum=" + sum);
    }

    //下面的方法使用递归实现1 ~ n的和
    public static int getSum(int n){
        if(n == 1){
            //满足条件递归结束
            return 1;
        }
        int temp = getSum(n - 1);
        return temp + n;
    }

}
