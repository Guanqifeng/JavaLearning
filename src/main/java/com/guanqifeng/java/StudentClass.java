package com.guanqifeng.java;

/**
 *java 虚拟机的内存可以分为三个区域：栈（stack）、堆（heap）和方法区（method area）
 * **方法区 也是 堆  的一部分，但比较特别
 * 1.栈的特点：
 * a.栈描述的是方法执行的内存模型。每个方法被调用都会创建一个栈帧（存储局部变量、操作数、方法出口等）
 * b.JVM为每个线程创建一个栈，用于存放该线程执行方法的信息（实际参数、局部变量等）
 * c.栈属于线程私有，不能实现线程间的共享！
 * d.栈的存储特性是“先进后出，后进先出”
 * e.栈是由系统自动分配，速度快，栈是一个连续的内容空间。
 * 2.堆的特点：
 * a.堆用于存储创建好的对象和数组（数组也是对象）
 * b.JVM只有一个堆，被所有线程共享
 * c.堆是一个不连续的内存空间，分配灵活，速度慢！
 * 3.方法区（又叫静态区）特点：
 * a.JVM只有一个方法区，被所有线程共享！
 * b.方法区实际也是堆，只是用于存储类、常量相关的信息。
 * c.用来存放程序中永远是不变或唯一的内容。(类信息、【class 对象】、静态变量、字符串常量等)
 */
public class StudentClass {
    /*
    在类体中定义相关的属性（field）及方法
     */
    int id;
    String name;
    int age;

    Computer comp ;

    /*
    方法表示这个类具有的行为特征
     */
    void study(){
        System.out.println("我在认真学习！"+comp.brand);
    }
    void play(){
        System.out.println("我在玩王者农药");
    }
    /*
    程序执行的入口
     */
    public static void main(String[] args) {
        StudentClass student = new StudentClass();//创建一个对象，调用了StudentClass的构造方法
        student.id = 1001;
        student.name = "Roy";
        student.age = 29;
        Computer c1 = new Computer();
        c1.brand = "Lenovo";
        student.comp = c1;
        student.play();
        student.study();
    }
}
class Computer{
    String brand;
    Computer(){

    }
}