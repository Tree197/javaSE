package com.sns.demo;

/**
 * @author sns
 * @create 2021-12-31 11:25
 * 测试if else  判断正整数
 */
public class Example08 {
    public static void main(String[] args){
        //如果能被2整除就是偶数否则奇数
        int a = 1;
        if (a % 2 == 0){
            System.out.println(a+"：是偶数");
        }else{
            System.out.println(a+"：是奇数");
        }
    }
}
