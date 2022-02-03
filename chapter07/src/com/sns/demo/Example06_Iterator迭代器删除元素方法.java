package com.sns.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sns
 * @create 2022-01-20 16:51
 * 在迭代器中不可以用使用集合的删除元素方法，会报异常。会影响迭代的准确性
 * 解决方法一：用集合自带的删除方法删除元素后，立即使用break关键字来停止迭代。
 * 解决方法二：使用迭代器中的删除方法删除元素。
 */
public class Example06_Iterator迭代器删除元素方法 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println("删除元素前："+list);

        //迭代器删除元素方法一：
        Iterator iterator = list.iterator();//获取迭代器
        while (iterator.hasNext()){     //判断集合是否有下一个元素
            Object obj = iterator.next();//取出集合中的元素
            if("张三".equals(obj)){       //判断该集合中的元素是否为 "张三"
                list.remove(obj);       //删除该集合中的元素
                break;
            }
        }
        System.out.println(list);

        //迭代器删除方法二：
        Iterator i = list.iterator();//获取迭代器
        while (i.hasNext()){     //判断集合是否有下一个元素
            Object obj = i.next();//取出集合中的元素
            if("王五".equals(obj)){       //判断该集合中的元素是否为 "王五"
                i.remove();       //使用迭代器中的删除方法
            }
        }
        System.out.println(list);

        //使用foreach删除元素
        for (Object obj : list){
            String str = (String) obj;  //强制类型转换
            if ("李四".equals(str)){
                list.remove(str);
            }
        }
        System.out.println(list);
    }
}
