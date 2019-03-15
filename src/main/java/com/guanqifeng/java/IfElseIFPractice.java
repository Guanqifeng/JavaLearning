package com.guanqifeng.java;

import java.util.Scanner;

public class IfElseIFPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println("您输入的年龄："+age);
        if(age > 90){
            System.out.println("您是寿星！");
        }
        else if(age > 70){
            System.out.println("祝您福如东海，寿比南山！");
        }
        else if(age >40){
            System.out.println("您出于人生巅峰");
        }
        else{
            System.out.println("您还年轻，需要努力！");
        }
    }
}
