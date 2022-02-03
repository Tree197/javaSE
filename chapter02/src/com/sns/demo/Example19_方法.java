package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-01 11:27
 */
//创建方法练习
public class Example19_方法 {
    public static void main(String[] args) {
        printChangFangXing(5,3);
        printChangFangXing(4,2);
        printChangFangXing(10,6);

    }

    //打印长方形
    static void printChangFangXing(){
        //用*打印一个宽为5，高为3的矩形
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();           //换行
        }
        System.out.println();       //换行

        //用*打印一个宽为4，高为2的矩形
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();           //换行
        }
        System.out.println();       //换行

        //用*打印一个宽为10，高为6的矩形
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();           //换行
        }
        System.out.println();       //换行
    }

    /**
     *  修改上边长方形的方法,使用方法的重写
     * @param width 宽
     * @param high 高
     */
    static void printChangFangXing(int width, int high){
        int i,j;
        for(i = 1; i <= high; i++){
            for (j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();//换行
        }
        System.out.println();   //换行
    }
}
