package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-10 3:40
 * 匿名内部类的练习
 *  */
public class Example19_匿名内部类 {
    public static void main(String[] args) {

        Animal19 animal = new Dog19();
        animalShout(animal);

        //使用匿名内部类的方法
        animalShout(new Animal19(){
            @Override
            public void shout() {
                System.out.println("这是通过匿名内部类的方式输出的..");
            }
        });

    }

    /**
     * @param animal     需要传入父类类型的变量
     */
    public static void animalShout(Animal19 animal){
        animal.shout();
    }
}


//创建接口
interface Animal19{
    void shout();
}

//创建类实现接口
class Dog19 implements Animal19{
    public void shout(){
        System.out.println("汪汪");
    }
}


