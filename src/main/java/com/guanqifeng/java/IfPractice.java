package com.guanqifeng.java;

/**
 * 测试选择语句：
 *  if
 */
public class IfPractice {
    public static void main(String[] args) {
        int i = (int)(6*Math.random()+1);
        int j = (int)(6*Math.random()+1);
        int k = (int)(6*Math.random()+1);

        int count = i+j+k;
        if(count >= 15){
            System.out.println("今天运气不错！");
        }
        if(count > 10 && count < 15){
            System.out.println("今天手气一般！");
        }
        if(count < 10){
            System.out.println("今天运气不好");
        }
        System.out.println("您的得分为："+count);
    }
}
