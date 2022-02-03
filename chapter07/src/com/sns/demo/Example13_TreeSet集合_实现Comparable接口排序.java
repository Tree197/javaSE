package com.sns.demo;

import java.util.TreeSet;

/**
 * @author sns
 * @create 2022-01-22 19:44
 * TreeSet想要给对象排序，必须要实现Comparable接口并重写ComparaTo()方法
 */
public class Example13_TreeSet集合_实现Comparable接口排序 {
    public static void main(String[] args) {
        Student_TreeSet sns = new Student_TreeSet("施宁树", 24);
        Student_TreeSet sns2 = new Student_TreeSet("施宁树", 24);
        Student_TreeSet sns3 = new Student_TreeSet("施宁树3", 24);
        Student_TreeSet lsh = new Student_TreeSet("李世宏", 23);
        Student_TreeSet lrt = new Student_TreeSet("里日天", 22);

        TreeSet treeSet = new TreeSet();
        treeSet.add(sns);
        treeSet.add(sns2);
        treeSet.add(sns3);
        treeSet.add(lsh);
        treeSet.add(lrt);

        for (Object obj : treeSet) {
            System.out.println(obj.toString());
        }
    }
}

class Student_TreeSet implements Comparable {
    private String name;
    private int age;

    public Student_TreeSet(String name, int age) {//构造方法
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {  //重写toString()方法
        return "Student_TreeSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        假设按照学生的年龄大小来排序
     */
    @Override
    public int compareTo(Object obj) {    //重写Comparable接口中的ComparaTo()方法
        Student_TreeSet stu = (Student_TreeSet) obj;    //强转类型
        if (this.age - stu.age > 0){    //定义比较方式
            return 1;
        }
        //如果年龄相同，根据名字来排序
        if (this.age - stu.age == 0){
            return this.name.compareTo(stu.name);
        }
        return -1;
    }
}
