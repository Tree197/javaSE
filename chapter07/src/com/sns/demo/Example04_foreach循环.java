package com.sns.demo;

import java.util.ArrayList;

/**
 * @author sns
 * @create 2022-01-20 16:40
 *
 */
public class Example04_foreach循环 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        //使用for循环遍历集合
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
