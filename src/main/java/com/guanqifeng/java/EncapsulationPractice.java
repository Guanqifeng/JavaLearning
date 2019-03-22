package com.guanqifeng.java;

import com.guanqifeng.java2.Human; //引入包及指定类

/**
 * 封装的实现：java是使用“访问控制符”来控制哪些细节需要封装，哪些细节需要暴露的。
 * 1.private：表示私有，只有自己类能访问。
 * 2.defualt：表示没有修饰符修饰，只有同一个包的类能访问。
 * 3.protected：表示可以被同一个包的类以及其他包中的子类访问。
 * 4.public：表示可以被该项目的所有包中的所有类访问。
 */
public class EncapsulationPractice {
    public static void main(String[] args) {
    /*
    private 测试。
     */
        //Human h1 = new Human(); 由于Human的无参构造函数未default类型，同一包内使用，程序报错
        Human h2 = new Human(10);
        h2.getAge();
        //h2.print();//夸包无法使用对象的protected方法
        //System.out.println(h2.age);//Human对象的age属性为私有属性，除Human类本身外，其他类不可食用

    }

}
