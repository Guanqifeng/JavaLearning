package com.guanqifeng.java;

public class CastingPractice {
    public static void main(String[] args) {
        Animal d1 = new Dog(); //向上转型，自动转型
        Animal c1 = new Cat();
        d1.shout(); //狗叫，父类引用指向子类对象
        c1.shout(); //猫叫，父类引用指向子类对象

        Dog d2 = (Dog)d1; //Animal对象强转为Dog对象，向下转型，需要强制转型
        d2.seeDoor();//Dog对象调用Dog对象方法，没问题
//        Dog d3 = (Dog)c1; //Animal对象强转为Dog对象,可以编译通过，但d3指向的是一个Cat对象
//        d3.seeDoor();//Cat对象调用Dog对象方法，有问题（java.lang.ClassCastException）

    }


}
