package com.guanqifeng.java;
/**
 * 测试常量
 */
public class ConstantPractice {
    public static void main(String[] args) {
        int age = 18;
        final String NAME = "Guan"; //定义常量时，按规范全部大写
        //name = "Sun"; 常量不可再进行修改
        final double PI = 3.14;
        System.out.println(age);
        System.out.println(NAME);
        System.out.println(PI);
    }
}
