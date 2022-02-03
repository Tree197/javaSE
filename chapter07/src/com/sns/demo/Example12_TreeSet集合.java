package com.sns.demo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author sns
 * @create 2022-01-22 9:40
 * TreeSet集合的特点：  元素有序,元素不可重复
 * 底层使用 自平衡排序二叉树
 * 排序的原理是每次存入对象之前都会调用对象的comparaTo()方法来进行比较
 * 想要存入对象排序，必须要实现Comparable接口，并重写comparaTo()方法
 *
 */
public class Example12_TreeSet集合 {
    /*
    由于String类已经实现了Comparable接口并重写了ComparaTo()方法
    所以可以正常排序
     */
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("abc");
        treeSet.add("bcd");
        treeSet.add("cde");
        treeSet.add("施宁树");

        TreeSet treeSet2 = new TreeSet();
        treeSet2.add("施宁树");
        treeSet2.add("cde");
        treeSet2.add("bcd");
        treeSet2.add("abc");

        Iterator i1 = treeSet.iterator();
        while (i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println();//换行

        Iterator i2 = treeSet2.iterator();
        while (i2.hasNext()){
            System.out.print(i2.next()+" ");
        }

    }
}
