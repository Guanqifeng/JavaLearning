package com.guanqifeng.java;

/**
 * 测试选择语句：
 *  if else
 */
public class IfElsePractice {
    public static void main(String[] args) {
      double r = 4*Math.random();
      double area = Math.PI*Math.pow(r,2);
      double circle = 2*Math.PI*r;
      System.out.println("圆的面积为："+area);
      System.out.println("圆的面积为："+circle);
      if(area > circle){
          System.out.println("圆的半径为："+r+"，其面积大于周长！");
      }else{
          System.out.println("圆的半径为："+r+"，其面积小于周长！");
      }
    }
}
