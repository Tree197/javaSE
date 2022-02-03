package com.sns.demo;

import java.util.Scanner;

/**
 * @author sns
 * @create 2021-12-31 11:42
 */
public class Example09_Switch {
    public static void main(String[] args) {
        //Switch01();
        //Switch02();

    }

    //Switch的使用01
    static void Switch01(){

        int arr[] = {1,2,3,4,5,6,7,8};
        switch (arr[7]){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            default:
                System.out.println("您输入的数字不正确！");
                break;
        }
    }

    //Switch的使用02
    static void Switch02(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1 ~ 10 的数字：");
        int i = scanner.nextInt();

        switch (i){
            case 1:
                System.out.println("您输入的是1：" + i);
                break;
            case 2:
                System.out.println("您输入的是2:" + i);
                break;
            default:
                System.out.println("您输入的数字不正确，请重新输入！");
                break;
        }
    }

}
