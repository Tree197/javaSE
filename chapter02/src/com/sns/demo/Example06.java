package com.sns.demo;
/**
 * @author sns
 * @create 2021-12-30 10:34
 */
public class Example06 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a,b;
        a = x > 0 & y++ > 1;    //逻辑运算符&对表达式进行运算
        System.out.println(a);
        System.out.println("y:" +y);

        b = x > 0 && z++ > 1;
        System.out.println(b);  //逻辑运算符&&对表达式进行运算
        System.out.println("z:" +z);

        //练习位运算符 ^ 按位异或符；
        int j = 0b01;
        int c = 0b00;
        int r = j ^ c;
        System.out.println(j +":"+c);
        System.out.println(r==j);

        //Integer.MAX_VALUE 常量的练习
        int max = Integer.MAX_VALUE;
        max += 1;
        System.out.println("max+1="+max);
        int min = Integer.MIN_VALUE;
        System.out.println("min="+min);

    }

}
