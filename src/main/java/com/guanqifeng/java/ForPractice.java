package com.guanqifeng.java;

/**
 * 测试for
 */
public class ForPractice {
    public static void main(String[] args) {
        int sum = 0;
        /*
        for 的执行步骤：
        1.初始化
        2.逻辑判断
        3.执行循环体
        4.步进迭代
        5.回到第二部继续判断
         */
        for(int i = 1;i<=100;i++)
        {
            sum += i;
        }
        System.out.println("1至100的和为："+sum);

        /*
        嵌套循环的使用
         */
        /*for(int i = 1; i<=5 ;i++){
            for(int j = 1 ;j<=5 ;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        for(int i= 1;i<=9;i++){
            for(int j = i;j>0;j--){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }

        /*
        查找所有5的倍数，并且输出5个数后换行
         */
        for(int i =1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+" ");
            }
            if(i%25 == 0){
                System.out.println();
            }
        }
    }
}
