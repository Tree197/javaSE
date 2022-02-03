package com.sns.demo;

/**
 * @author sns
 * @create 2022-01-10 10:58
 * 自定义异常练习
 */
public class Example26_自定义异常 {
    public static void main(String[] args){

        try {
            //调用divide方法
            int result = divide(4, 0);
            System.out.println(result);
        } catch (DivideException e) {
            e.printStackTrace();    //打印堆栈信息
        }

    }

    /**
     *
     * @throws DivideException
     * 声明一个异常对象 也需要在方法后边抛出异常
     */
    public static int divide(int x, int y )throws DivideException{
        if(y <= 0){
            throw new DivideException("被除数不可以是负数或0");
        }
        return x / y;
    }
}


//自定义一个异常类
class DivideException extends Exception{
    //调用父类的无参构造方法
    public DivideException(){
        super();
    }

    //调用父类的有参构造方法
    public DivideException(String message){
        super(message);
    }

}

