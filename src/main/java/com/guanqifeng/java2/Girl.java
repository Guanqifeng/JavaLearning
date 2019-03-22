package com.guanqifeng.java2;

public class Girl extends Human {
    Girl(){//同包下的子类可以继承父类的default方法
        super();
        System.out.println("Girl's no parameter constructor");
    }
    Girl(int age){
        super(age);
        System.out.println("Girl's one parameter constructor");
    }
    public static void main(String[] args) {
        Girl g= new Girl();
        Human h = new Human();
        Girl g2 = new Girl(20);
        //System.out.println(g.age); //age属性为Human类私有属性
        //System.out.println(h.age); //age属性为Human类私有属性
    }
}
