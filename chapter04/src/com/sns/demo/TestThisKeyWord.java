package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-09 4:49
 */
public class TestThisKeyWord {
    public static void main(String[] args) {
//        Target tar = new Target();
        tar t = new tar();
        t.introduce();
    }
}

class Target{
    public final int A = 100;

    public Target(){}
    public static void method1(){
    }
    public static void method2(){}
}

class tar extends Target{

    public String name;
    public void introduce(){
        System.out.println("我叫:"+name);
    }

}