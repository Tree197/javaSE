package com.sns.demo;

import java.util.LinkedList;

/**
 * @author sns
 * @create 2022-01-20 16:01
 * LinkedList集合 底层是 双向循环链表
 * 增删效率快
 */
public class Example02_LinkedList集合的使用 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();     //创建LinkedList集合
        link.add("张三");     //存数据
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString());    //取出并打印集合中的元素

        link.add(3,"吕布:我插队了");
        link.addFirst("曹操:我插队到了第1名");   //将元素插入到第一位
        System.out.println(link);

        System.out.println(link.getFirst());    //取出集合中第一个元素
        link.remove(3); //删除集合中指定位置的元素
        link.removeFirst();     //删除第一个元素
        System.out.println(link);
    }
}
