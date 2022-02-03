package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 10:57
 * 课后题
 * 结论，使用Private修饰的成员内部类无法通过实例化的方式在外部访问
 */
public class 课后题3 {
    public static void main(String[] args) {
        //OuterTest.InnerTest inner = new Outer().new InnerTest();
        OuterTest out = new OuterTest();
       out.ttt();

    }
}

class OuterTest{
    public String name = "Outer";


    public void ttt(){
        InnerTest inner = new InnerTest();
        inner.showName();
    }
    private class InnerTest{
        String name = "inner";
        void showName(){
            System.out.println(name);
        }
    }
}