package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 4:35
 * static  用该单词修饰的变量为静态变量，与所有实例共享
 */
public class Example12_static {
    public static void main(String[] args) {
        //设置学校名字
        //Student.schoolName = "广西职业技术学院";
        Student s1 = new Student();
        s1.schoolName = "广西职业技术学院";
        Student s2 = new Student();
        System.out.println("s1学校名称:" + s1.schoolName);
        System.out.println("s2学校名称:" + s2.schoolName);
        System.out.println("-------------");

        System.out.println("s3学校名称:"+ Student.staticMeth().schoolName);


    }
}

class Student {
    public static String schoolName;

    public static Student staticMeth(){
        return new Student();
    }


}
