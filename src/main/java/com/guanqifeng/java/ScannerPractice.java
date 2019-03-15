package com.guanqifeng.java;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.println("你的名字为："+name);
        System.out.println("你的年龄为："+age);
        System.out.println("你来到地球多少天："+age*365);
        System.out.println("你距离离开地球多少天："+(72-age)*365);
    }
}
