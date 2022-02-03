package com.sns.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sns
 * @create 2022-01-19 6:28
 * ArrayList集合  底层是 数组
 * 查询效率快，增删慢
 */
public class Example01_ArrayList集合的使用 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //创建集合
        list.add("张三"); //往list集合存数据
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        System.out.println("集合的长度："+list.size());   //获取集合的长度
        System.out.println("第2个元素是："+list.get(1));  //取出集合中第二个元素

    }
}


