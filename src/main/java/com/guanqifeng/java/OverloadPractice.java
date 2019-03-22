package com.guanqifeng.java;

/**
 * 测试方法重载
 * 构成方法重载的条件
 */
public class OverloadPractice {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(1,2,3));
        System.out.println(add(3.423,64.211));
    }
    public static int add(int n1,int n2){
        int sum = n1 + n2;
        return sum;
    }

    public static int add(int a,int b, int c){
        int sum = a + b + c;
        return sum;
    }
    public static double add(double n1,double n2){
        double sum = n1 + n2;
        return sum;
    }
//    public static double add(int n1,int n2){ //仅有返回类型不同的时候，不构成重载
//        double sum = n1 + n2;
//        return sum;
//    }
//    public static int add(int n2,int n1){ //仅参数名不同不构成重载
//        int sum = n1 + n2;
//        return sum;
//    }

}
