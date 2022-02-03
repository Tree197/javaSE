package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-16 6:18
 * StringBuffer称为字符串缓冲区
 */
public class Example08_StringBuffer类 {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer("abcd");
        System.out.println("在字符串("+strBuff+")后边添加(EFG)这三个字母："+strBuff.append("EFG"));
        System.out.println("在字符串("+strBuff+")的第2位置插入(你好Java!)："+strBuff.insert(0,"你好Java!"));
        System.out.println("移除字符串("+strBuff+")中索引为6的字符："+strBuff.deleteCharAt(6));
        System.out.println("删除字符串("+strBuff+")中索引0 ~ 5的字符串："+strBuff.delete(0,6));//范围删除方法包含开头不包含结尾
        System.out.println("替换字符串("+strBuff+")中索引0 ~ 3的字符串为(ABCD)："+strBuff.replace(0,3,"ABCD"));
        //"修改字符串中索引 0 的字符为（a）：
        strBuff.setCharAt(0,'a');
        System.out.println("修在字符串中索引 0 的字符为（a）结果："+strBuff);
        System.out.println("使用toString()方法："+strBuff.toString());
        System.out.println("将字符串("+strBuff+") 反转："+strBuff.reverse());
    }
}
