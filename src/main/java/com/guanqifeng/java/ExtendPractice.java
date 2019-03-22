package com.guanqifeng.java;

public class ExtendPractice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Guan1";
        s1.id = 1001;
        s1.major = "classOne";
        s1.rest();

        Student s2 = new Student("Guan2",1002,"classTwo");
        s2.study();
        s2.rest();//Student 类的对象可以使用父类Person的函数

        System.out.println(s1 instanceof Student); //s1是否是 Student类的实例（对象）
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Object);
        System.out.println(new Person() instanceof Student);
    }
}

class Person{
    String major;
    public void rest(){
        System.out.println("休息一下！");
    }
}

class Student extends Person{
    int id;
    String name;
    public void study(){
        System.out.println("学习一下！");
    }
    public Student(String name,int id,String major){
        this.name = name;
        this.id = id;
        this.major = major;
    }
    public Student(){

    }
}