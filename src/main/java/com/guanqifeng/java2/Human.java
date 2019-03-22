package com.guanqifeng.java2;

public class Human {
    private int age;
    Human(){
        System.out.println("Human's no parameter constructor！");
    }
    public Human(int age){
        this();
        System.out.println("Human's one parameter constructor！");
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    protected void print(){
        System.out.println("This is Human Function!");
    }
}
