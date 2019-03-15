package com.guanqifeng.java;

public class IdentifierPractice {
    public static void main(String[] args) {
        //标识符开头：字母、下划线及美元符$ （Java中是Unicode标准国际字符集，包含中文）
        int $test = 1 ;
        String _goodMan = "yes";//变量名遵循驼峰格式
        Double number = 92.3;
        int 哈sd = 10; //尽量不要使用中文做标识符
        float 要4有y = 2733.2F;
        String sd$ds = "test2";
        //int 22sda = 20; 不合法
        //String dj-sds = "asdsa"; 不合法
        //short class = 82; 关键字不能做标识符
        System.out.println($test);
        System.out.println(_goodMan);
        System.out.println(number);
        System.out.println(哈sd);
        System.out.println(要4有y);
        System.out.println(sd$ds);
    }
}
