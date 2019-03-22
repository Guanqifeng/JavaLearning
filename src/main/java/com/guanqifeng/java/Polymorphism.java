package com.guanqifeng.java;

/**
 * 多态练习：
 *   多态指的是同一个方法调用，由于对象不同可能会有不同的行为。现实生活中，同一个方法，具体时间会完全不同。
 * 多态条件：
 * 1.多态是方法的多态，不是属性的多态（多态与属性无关）
 * 2.多态的存在要有3个必要条件：继承、方法重写、父类引用指向子类对象。
 * 3.父类引用指向子类对象后，用该父类引用调用子类对象重写的方法，此时多态就出现了。
 */
class Animal{
    public void shout(){
        System.out.println("叫一声。。。");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        getShout(a);
        Dog d = new Dog();
        getShout(d);
        Cat c = new Cat();
        getShout(c);

    }
    static void getShout(Animal a){
        a.shout();
    }
}
