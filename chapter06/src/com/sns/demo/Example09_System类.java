package com.sns.demo;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author sns
 * @create 2022-01-16 12:06
 * 练习System类中的一些方法
 */
public class Example09_System类 {
    public static void main(String[] args) throws Exception{
        //获取当前系统时间戳
        long startTimeMillis = System.currentTimeMillis();
        //Thread.sleep(2000);
        int sum = 0;
        for (int i = 1; i <= 1000000000; i++){
            sum += i;
        }
        long endTimeMillis = System.currentTimeMillis();
        long elapsedTimeMillis = endTimeMillis - startTimeMillis;    //消耗的时间
        System.out.println("用时毫秒: "+elapsedTimeMillis);
        System.out.println("用时秒："+elapsedTimeMillis/1000);

        //获取系统的属性
        Properties sysProperties = System.getProperties();
        Enumeration<?> propertyNames = sysProperties.propertyNames();//返回properties中key的集合
        while (propertyNames.hasMoreElements()){       //如果该集合还有下一个元素就遍历出来
            String key  = (String) propertyNames.nextElement();
            String value = sysProperties.getProperty(key);
            System.out.println(key+"-----"+value);
        }

        //System.arraycopy()方法的使用，从一个数组拷贝数据到另一个数组
        int[] srcArr = {1,2,3,4,5,6};
        int[] tarArr = {7,8,9,10,11,12};
        System.arraycopy(srcArr,0,tarArr,0,3);
        //遍历数组
        for (int i = 0; i < tarArr.length; i++){
            System.out.print(tarArr[i]+" ");
        }


    }
}
