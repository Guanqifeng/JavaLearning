package com.guanqifeng.java;

/**
 * 创建一个对象分为四步：
 * 1.分配对象空间，并将对象成员变量初始化为0或空（null）
 * 2.执行属性值的显式初始化
 * 3.执行构造方法
 * 4.返回对象的地址给相关的变量
 *
 * this的本质是“创建好的对象的地址”
 * this最常用用法：
 * 1.在程序中产生二义性之处，应使用this来指明当前对象，普通方法中，this总是指向调用该方法的对象。
 *   构造方法中，this总是指向正要初始化的对象。
 * 2.使用this对象调用重载的构造方法，避免相同的初始化代码，但只能在构造方法中用，并且必须位于
 *   构造方法的第一句。
 * 3.this 不能用于static方法
 */
public class ThisPractice {
    int a ;
    int b ;
    int c ;
    ThisPractice(int a,int b){
        this.a = a;
        this.b = b;
    }
    ThisPractice(int a ,int b ,int c){
        this(a,b);
        this.c = c;
    }
    void sing(){
        System.out.println("Sing A Song");
    }

    void eat(){
        sing();
        System.out.println("你妈妈喊你吃饭");
    }

    public static void main(String[] args) {
        ThisPractice t = new ThisPractice(1,2,3);
        t.eat();
        System.out.println(t.a);
    }
}
