package com.guanqifeng.java;

/**
 * 重写（覆盖父类函数）练习：
 * 1.方法名、形参列表相同
 * 2.返回值类型和失衡梦异常类型，子类小于等于父类
 * 3.访问权限，子类大于等于父类
 */
public class OverridePractice {
    public static void main(String[] args) {

    }
}
class Vehicle{
    public void run(){
        System.out.println("跑...");
    }
    public void stop(){
        System.out.println("停!");
    }
    public Person getPerson(){
        return new Person();
    }
}
class Horse extends Vehicle{
    public void run(){  //子类重写父类函数，方法名与形参列表同父类一致
        System.out.println("四蹄翻飞，哒哒哒。。。");
    }
//    public Object getPerson(){  //Object 是 Person的父类,程序报错
//        return new Object();
//    }
    public Student getPerson(){  //Student 是 Person的子类
        return new Student(); //具有返回值得方法，返回结果，子类小于等于父类
    }
}