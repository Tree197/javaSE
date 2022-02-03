package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-08 2:54
 * 构造方法:
 *      特点： 方法名与类名一致，没有返回值，如果不写权限修饰符，默认就是public
 */
public class Example09_构造方法 {
    public static void main(String[] args) {
        Person person = new Person();
        person.getAge(18);
    }


}

class Person {

   public Person(){
        System.out.println("我被第一次创建了");
    }
    public void getAge(int age){
        System.out.println("我是Person，" + age + "岁了");
    }

}
