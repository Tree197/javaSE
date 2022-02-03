package com.sns.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sns
 * @create 2022-01-20 16:14
 * 可以遍历集合
 */
public class Example03_Iterator遍历迭代器 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //创建集合
        list.add("张三"); //往list集合存数据
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        Iterator iterator = list.iterator();    //获取Iterator对象
        while (iterator.hasNext()){         //判断list集合中是否有下一个元素
            Object obj = iterator.next();   //取出集合中的元素
            System.out.println(obj);    //打印集合中的元素
        }
    }
}
