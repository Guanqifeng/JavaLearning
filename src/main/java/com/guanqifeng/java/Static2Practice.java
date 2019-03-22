package com.guanqifeng.java;

import javax.sound.midi.Soundbank;

public class Static2Practice {
    int id;
    String name;
    static String company;
    Static2Practice(){
        System.out.println("Constructor");
    }
    Static2Practice(int id,String name){
        System.out.println("Constructor");
        this.id = id;
        this.name = name;
    }
    static {
        System.out.println("静态初始化块");
        company = "学习使用";
        printInfo();
    }
    public static void printInfo(){
        System.out.println(company);
    }
    public void updateName(Static2Practice s){
        s.name = "Guan Qifeng";
    }
    public void ptintOther(Static2Practice s){
        s = new Static2Practice();
    }
    public static void main(String[] args) {
        Static2Practice s = new Static2Practice(100,"Guan");
        System.out.println(s.name);
        s.updateName(s);
        System.out.println(s.name);
        s.ptintOther(s);
        System.out.println(s.name);
    }
}
