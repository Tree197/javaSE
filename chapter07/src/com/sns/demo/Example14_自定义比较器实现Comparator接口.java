package com.sns.demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author sns
 * @create 2022-01-22 20:09
 * 不想实现Comparable接口不想用comparaTo()方法排序
 * 可以自定义比较器，需要实现Comparator接口,重写compare()方法
 * 并且在创建TreeSet集合的时候，在其构造方法传入实现了Comparator接口的类
 */
public class Example14_自定义比较器实现Comparator接口 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());
        String sns = "施宁树";
        String lsh = "李世宏";
        String aaa = "aaa";
        String bbb = "bbb";
        String cccc = "cccc";

        treeSet.add(sns);
        treeSet.add(lsh);
        treeSet.add(aaa);
        treeSet.add(bbb);
        treeSet.add(cccc);

        for (Object o : treeSet) {
            System.out.println(o);
        }
    }
}

class MyComparator implements Comparator {

    /*
        重写compare方法
        假设根据字符串的长度进行排序
     */
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        return 9;
    }
}
