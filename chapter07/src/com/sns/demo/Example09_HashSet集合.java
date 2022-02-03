package com.sns.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author sns
 * @create 2022-01-21 12:43
 * HashSet集合 ： 所存储的元素都是不可重复的，并且元素是无序的
 * HashSet集合的存取数据方法与list集合一样
 */
public class Example09_HashSet集合 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("张三");
        set.add("赵六");

        System.out.println("set集合的长度："+set.size());

        //使用Iterator迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

