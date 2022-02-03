package com.sns.demo;

import java.util.HashSet;

/**
 * @author sns
 * @create 2022-01-21 13:10
 * HashSet集合存入自定义类对象默认不会过滤重复数据。
 * 想要过滤重复数据，必须要重写hashCode() 与 equals() 方法
 *
 */
public class Example10_HashSet存入自定义类不过滤重复的问题 {
    public static void main(String[] args) {
        Student_Set lsh = new Student_Set("1", "李世宏");
        Student_Set sns = new Student_Set("2", "施宁树");
        Student_Set sns2 = new Student_Set("2", "施宁树");


        //创建set集合，存入重复数据
        HashSet<Student_Set> set = new HashSet<>();
        set.add(lsh);
        set.add(sns);
        set.add(sns2);

        System.out.println(set);


    }
}

class Student_Set {
    String id;
    String name;

    public Student_Set(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_Set{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //重写hashCode()方法
    public int hashCode(){
        //假设id相同就视为同一个人,所以返回id的HashCode
        return id.hashCode();
    }

    //重写equals方法判断是否同一对象
    public boolean equals(Object obj) {
        if (this == obj){       //判断对象地址是否相同
            return true;       //如果是返回true
        }
        if (!(obj instanceof Student_Set)){ //判断是否是Student_Set类型
            return false;       //如果不是返回false
        }
        //执行到这里，说明这两个对象地址不相同，类型相同,那就对比id看是否相同
        Student_Set stu = (Student_Set) obj;    //类型相同就可以强制转换成student对象
        boolean flag = this.id.equals(stu.id); //对比他们的id是否一致
        return flag;
    }
}

