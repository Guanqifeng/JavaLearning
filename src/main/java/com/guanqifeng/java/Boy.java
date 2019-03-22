package com.guanqifeng.java;

import com.guanqifeng.java2.Human;

public class Boy extends Human {

    public Boy(int age) {  //由于Human的无参构造器为default类型，只能继承含参构造器
        super(age);
    }

    public static void main(String[] args) {
        Boy b = new Boy(20);
        b.print();//夸包的子类可以继承父类的protected方法
    }
}
