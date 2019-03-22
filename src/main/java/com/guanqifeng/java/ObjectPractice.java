package com.guanqifeng.java;

public class ObjectPractice {


    public static void main(String[] args) {
        Person2 p = new Person2(30,"guan");
        System.out.println(p.toString());
    }
}
class Person2{
    int age;
    String name;
    public Person2(int age ,String name){
        this.age = age;
        this.name = name;
    }
//    public String toString(){
//        return this.name+",年龄："+this.age;
//    }
}