package com.guanqifeng.java;

/**
 * 测试循环中的break 、continue
 */
public class BreakPractice {
    public static void main(String[] args) {

        /*int num;
        int total = 0;
        while(true){
            total ++;
            num = (int)(100*Math.random()+1);
            System.out.println(num);
            if(num == 88){
                break;
            }
        }
        System.out.println("获取了多少次："+total);*/
        /*
        把100~150之间不能被三整除的数输出，并且每行输出5个数
         */
        int total = 0;
        for(int i =100;i<=150;i++){
            if(i%3==0){
                continue;
            }
            total ++;
            System.out.print(i+"、");
            if(total%5 == 0){
                System.out.println();
            }
        }
    }
}
