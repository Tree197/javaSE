package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-01 10:52
 */
//循环体练习
public class Example15_循环体 {
    public static void main(String[] args) {
        JiShuQiuHe();
    }
    //嵌套循环
    static void QianTaoXunHuan(){
        //输出9行的三角形
        sns:for (int i = 1; i <= 9; i++){
            for (int j = 0; j < i; j++){
                if(i>4){
                    break sns;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //对1~100之内的奇数求和
    static void JiShuQiuHe(){
        int sum = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("1~100奇数求和=：" + sum);
    }
}
