package com.guanqifeng.java;

/**
 * 递归包含两部分：
 * 1.递归头：什么时候不调用自身方法。
 * 2.递归体：什么时候需要调用自身方法。
 */
public class RecursionPractice {
    public static void main(String[] args) {
        long d3 = System.currentTimeMillis();
        System.out.println(factorial(10));
        long d4 = System.currentTimeMillis();
        System.out.printf("递归花费的时间:%s%n",d4-d3);

        System.out.println(whileFactorial(10));
    }
    static int factorial(int n){
        /*
        尽量避免使用递归，所有的递归操作都可以通过迭代实现，递归既耗内存又耗费时间
         */
       if(n==1){
           return 1;
       }else{
           return n*factorial(n-1);
       }
    }
    static long whileFactorial(int n){
        long wd1 = System.currentTimeMillis();
        long result = 1;
        while(n>1){
            result *= n*(n-1);
            n -= 2;
        }
        long wd2 = System.currentTimeMillis();
        System.out.printf("循环花费的时间:%s%n",wd2-wd1);
        return result;
    }
}
