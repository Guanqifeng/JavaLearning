package com.guanqifeng.java;

/**
 * 测试 while
 */
public class WhilePractice {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        /*
         while 循环：先判断后执行
         */
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println("1至100的和为："+sum);

        /*
        do while循环：限制性后判断
         */
        int ii = 1;
        int sum2 = 0;
        do{
            sum2 += ii;
            ii++;
        }while(ii<=100);
        System.out.println("1至100的和2为："+sum2);
    }
}
