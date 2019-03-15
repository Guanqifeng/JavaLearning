package com.guanqifeng.java;

public class VariablePractice {
    int c; //成员变量从属于对象。成员变量会自动被初始化
    static int d; //静态变量冲属于类
    public void variablePrint(){
        System.out.println(c);//对象创建并调用当前函数时，输出内容
    }
    public static void main(String[] args) {
        System.out.println(d);
        //Java是一个强类型的语言，变量必须制定数据类型
        /*
           1.变量包含：变量名，变量类型及作用域。
           2.变量需要声明，必须在初始化后才能使用。
           3.变量都有类型，类型可以是基本类型，也可以是引用类型
           4.变量名必须是合法的标识符
           5.变量声明是一条完整的语句，因此每一个声明都必须以分号结束
         */
        {
            //局部变量 ,从属于语句块
            int b = 90; //局部变量，在使用前必须初始化
            System.out.println(b);
        }
        //System.out.println(b); 局部变量不可以在语句块外使用
        int a; //局部变量 ,从属于方法
        a = 10;
        System.out.println(a);
        VariablePractice v = new VariablePractice();
        v.variablePrint();
    }
}
