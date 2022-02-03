package com.sns.demo;

import java.util.Scanner;

/**
 * @author sns
 * @create 2022-01-17 12:14
 * 练习解析方法parseInt() ：将传入的字符串转换为Int类型
 */
public class Example21_Integer的方法练习 {
    public static void main(String[] args) {
        //创建扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("我们需要打印一个矩形");

        //将String类型的值解析为Int类型
        System.out.print("请输入宽：");
        int width = Integer.parseInt(scanner.next());
        System.out.print("请输入高：");
        int high = Integer.parseInt(scanner.next());

        for (int i = 1; i <= high; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();//换行
        }

    }
}
