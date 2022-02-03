package com.sns.demo;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author sns
 * @create 2022-01-20 17:20
 * 可以从集合末尾开始向前迭代
 * 该迭代器只支持List集合使用
 */
public class Example07_ListIterator反向迭代器 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三1");
        list.add("李四2");
        list.add("王五3");
        list.add("赵六4");

        System.out.print("迭代前：" + list + "\n");
        //获取ListIterator迭代器
        ListIterator listIterator = list.listIterator(list.size()); //传入的参数是集合的长度，表示从最后一个元素开始遍历
        while (listIterator.hasPrevious()){ //如果有前一个元素
            Object previous = listIterator.previous();  //取出前一个元素
            System.out.print(previous + " ");
        }
    }
}
