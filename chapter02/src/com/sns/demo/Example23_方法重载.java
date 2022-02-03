package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-02 4:32
 * 方法的重载
 */
public class Example23_方法重载 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1.1,2.1);
        System.out.println("-------------");    //换行
        System.out.println(suanShu(1,1));
        System.out.println(suanShu(1.1,1.1));
        System.out.println(suanShu(1,2,3));

    }

    //定义无返回值的方法，实现2个数相加，三个数相加，小数相加
    public static void add(int x, int y){
        System.out.println("两位整数相加= "+ (x+y));
    }
    public static void add(int x, int y, int z){
        System.out.println("三位整数相加= "+ (x+y+z));
    }
    public static void add(double x, double y){
        System.out.println("两位小数相加= "+ (x+y));
    }

    /*
        定义有返回值的方法
     */

    //两位整数相乘
    public static int suanShu(int x, int y){
        return x * y;
    }
    //两位小数相加
    public static double suanShu(double x, double y){
        return x + y;
    }
    //三位数相加
    public static int suanShu(int x, int y, int z){
        return x + y + z;
    }
}
