package com.sns.demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author sns
 * @create 2022-01-20 17:33
 */
public class Example08_Enumeration接口 {
    public static void main(String[] args) {
        //创建Vector集合
        Vector vector = new Vector();
        vector.add("str1");
        vector.add("str2");
        vector.add("str3");
        vector.add("str4");

        //获取Enumeration迭代器对象
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){     //如果有下一个元素
            Object obj = elements.nextElement(); //取出下一个元素
            System.out.println(obj);
        }
    }
}
