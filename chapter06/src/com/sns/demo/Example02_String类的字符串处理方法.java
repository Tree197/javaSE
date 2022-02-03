package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-15 5:22
 * 字符串处理方法
 */
public class Example02_String类的字符串处理方法 {
    public static void main(String[] args) {
        String str = "abcd你好我是字符串abcd！";
        System.out.println("字符串（"+str+ "）中“你”字符的位置："+ str.indexOf('你'));   //indexOf(int ch) 返回指定字符在此字符串中第一次出现的索引位置
        System.out.println("字符串（"+str+ "）中“d”字符最后出现的位置："+ str.lastIndexOf('d')); //lastIndexOf( )  返回指定字符在此字符串中最后一次出现的索引位置
        System.out.println("字符串（"+str+ "）在第14位的字符是："+ str.charAt(14)); //charAt( ) 返回该字符串中指定索引位置的字符
        System.out.println("字符串（"+str+ "）是否以“！”结尾："+ str.endsWith("！")); //判断字符串是否以指定字符结尾
        System.out.println("字符串（"+str+ "）的长度是："+ str.length());     //返回该字符串的长度
        System.out.println("字符串（"+str+ "）使用equals()方法进行对比："+ str.equals(new String("abcd你好我是字符串abcd！")));
        System.out.println("字符串（"+str+ "）判断这个字符串是否为空：" +str.isEmpty());
        System.out.println("字符串（"+str+ "）判断此字符串是否以指定的字符串开始："+ str.startsWith("ab"));
        System.out.println("字符串（"+str+ "）判断此字符串中是否包含指定的字符串："+ str.contains("我是"));
        System.out.println("字符串（"+str+ "）将此字符串中的所有字符转换为大写："+ str.toUpperCase());
        System.out.println("字符串（"+str+ "）将此字符串中的所有字符转换为小写："+ str.toLowerCase());
        System.out.println("字符串（"+str+ "）将int类型的数值转换为String类型"+ str.valueOf(321123141));
        char[] c = str.toCharArray();       //将此字符串转换为字符数组
        for (int i = 0; i < c.length; i++){ //遍历字符数组
            System.out.print(c[i]);
            if (i == c.length-1){
                System.out.println();//换行
            }
        }
        System.out.println("字符串（"+str+ "）替换此字符串中的指定字符："+ str.replace("abcd","aaaa"));
        //split（）方法，从此字符串中通过指定字符分返回一个String数组，并删除分割的字符
        String[] s = str.split("b");
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i]);
            if (i == s.length-1){
                System.out.println();//分行
            }
        }

        System.out.println("字符串（"+str+ "）返回指定索引之后的字符串："+ str.substring(3));//注意该方法包含开头不包含结尾
        System.out.println("字符串（"+str+ "）返回指定区间索引的字符串，包含开头不包含结尾："+ str.substring(0,4));//注意该方法包含开头不包含结尾
        String str2 = "  前面有2个空格，中间有一个空格 后面有一个空格 ";
        System.out.println("原字符串："+str2);
        System.out.println("使用trim()方法去首尾空格：--"+str2.trim()+"--");


    }



}
