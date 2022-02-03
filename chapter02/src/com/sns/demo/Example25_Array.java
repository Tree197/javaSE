package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-02 11:29
 * 数组的创建以及使用
 */
public class Example25_Array {
    public static void main(String[] args) {
//        Example25_Array array = new Example25_Array();
//        int max = array.maxValue(new int[]{4,2,1,4,5});
//        System.out.println("最大值=：" + max);
        int x =0;
        System.out.println("结果:=" + (x++)/3);
        //创建一个二位数组
//        int[][] arr = new int[3][2];
//        int[][] arr2 = {{1,1},{2,233,888}};
//        System.out.println(arr2[0][0]);
//        System.out.println(arr2[1][2]);
//        arr[0][0] = 1;
//        arr[0][1] = 2;
       // arr[0][2] = 3;
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);

        //创建一个数组
//        int x[] = new int[100];
//        int []a = new int[100];
//        int[] c = new int[2];
//        int[] b = {1,1,1,1,1,1,1,1};
//        x[1] = 1;
//        a[1] = 2;
//        System.out.println(x[1]);
//        System.out.println(a[1]);
    }


    //求整型数组中最大值的方法
    public int maxValue(int[] arr  ){
        //定义存储最大值的变量,首先假设数组中第一个数为最大值
        int max = arr[0];
        //遍历数组
        for (int i = 1; i < arr.length; i++){
            //判断大小数，并赋值
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
