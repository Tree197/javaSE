package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 6:31
 *
 */
public class Example16_内部类 {
    public static void main(String[] args) {
        //测试内部类结果
        Outer outer = new Outer();
        outer.test();

        //第二种访问内部类的方法
        Outer.Inner in2 = new Outer().new Inner();
        in2.show();

    }


}

//定义一个外部类
class Outer{
    private int num = 4;    //定义成员变量
    public void test(){
        //创建内部类对象
        Inner inner = new Inner();
        inner.show();
    }

    //创建内部类
    class Inner {
        void show(){
            //在成员内部内中访问外部类的成员变量
            System.out.println("num= "+num);
        }
    }


}
