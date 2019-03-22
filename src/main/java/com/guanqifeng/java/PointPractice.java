package com.guanqifeng.java;

/**
 * 构造器也叫构造方法（constructor），用于对象的初始化
 * 要点：
 * 1.通过new关键字调用
 * 2.构造器虽然有返回值，但是不能定义返回值类型（返回值得类型肯定是本类），不能在
 *   构造器里使用return返回某个值（可以仅使用return关键字，用于退出方法）。
 * 3.如果我们没有定义构造器，则编译器会定义一个无参的构造器，如果已经定义则编译器不会自动添加！
 * 4.构造器的方法名必须和类名一致！
 */
public class PointPractice {
    double x;
    double y;
   public PointPractice(double x,double y){
       this.x = x;
       this.y = y;
   }
   public PointPractice(){
       x = 0.0;
       y = 0.0;
   }
   public double getDistance(PointPractice p){
       return Math.sqrt(Math.pow((x - p.x),2)+Math.pow((y - p.y),2));
   }

    public static void main(String[] args) {
        PointPractice orgien = new PointPractice();
        PointPractice p1 = new PointPractice(3.0,4.0);
        System.out.println(p1.getDistance(orgien));
    }
}
