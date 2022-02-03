package com.sns.demo;

import java.util.ArrayList;

/**
 * @author sns
 * @create 2022-01-20 16:43
 */
public class Example05_foreach循环不能修改数组或集合的元素 {
    public static void main(String[] args) {
        String[] strs = {"张三","李四","王五"};

        for (String str : strs) {
            str = "王八蛋";
        }
        System.out.println("使用foreach循环修改前："+strs[0]+","+ strs[1]+","+ strs[2]);
        System.out.println("使用foreach循环修改后："+strs[0]+","+ strs[1]+","+ strs[2]);

        System.out.println("-------------------------------------");

        //使用for循环修改
        System.out.println("使用for循环修改前："+strs[0]+","+ strs[1]+","+ strs[2]);
        for (int i = 0; i < strs.length; i++){
            strs[i] = "王八蛋";
        }
        System.out.println("使用for循环修改后："+strs[0]+","+ strs[1]+","+ strs[2]);
    }
}
