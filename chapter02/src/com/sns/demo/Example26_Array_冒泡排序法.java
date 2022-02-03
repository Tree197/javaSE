package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 1:22
 * 冒泡排序方法
 */
public class Example26_Array_冒泡排序法 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        Example26_Array_冒泡排序法 arr = new Example26_Array_冒泡排序法();
        int[] paiXuHou = arr.paiXu(array);
        arr.printArr(paiXuHou); //调用打印方法
    }

    //冒泡排序方法
    public int[] paiXu(int[] arr){
        //第一步先遍历这个数组
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length -1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];          //交换位置
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //遍历打印数组方法
    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }
}
