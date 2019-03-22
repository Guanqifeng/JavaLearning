package com.guanqifeng.java;

/**
 * static：
 * 在类中，用static声明的成员变量为静态成员变量，也称为类变量。类变量的生命周期和类相同，
 * 在整个应用程序执行期间都有效。
 *****注：
 * static修饰的成员变量和方法，从属于类。普通变量和方法从属于对象的。
 */
public class StaticPractice {
    int id ;
    String name;
    String pwd;
    StaticPractice(int id, String name){
        this.id = id;
        this.name = name;
    }
    StaticPractice(int id, String name,String pwd){
        this(id, name);
        this.pwd = pwd;
    }
    static String company = "尚学堂";

    public void login(){
        System.out.println("输入的登录名为"+name);
        System.out.println("输入的ID为"+id);
    }
    static void printCompany(){
        //login(); 静态方法无法调用普通方法
        System.out.println(company);
    }

    public static void main(String[] args) {
        StaticPractice sp = new StaticPractice(1001,"ROY","123456");
        sp.login();
        sp.company = "SXT YY";
        sp.printCompany();
    }
}
