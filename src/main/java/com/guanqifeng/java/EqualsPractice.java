package com.guanqifeng.java;

public class EqualsPractice {
    public static void main(String[] args) {
        User u1 = new User(1001,"guan1","12345");
        User u2 = new User(1001,"guan2","12345");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2)); //重写Objec的equals方法

        String str1 = "sxt";
        String str2 = new String("sxt");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
class User{
    int id;
    String name;
    String passwd;
    public User(int id,String name,String passwd){
        this.id = id;
        this.name = name;
        this.passwd = passwd;
    }
    @Override
    public boolean equals(Object ob){
        if(this == ob){
            return true;
        }else if(ob == null){
            return false;
        }
        User uob = (User)ob;
        if(this.id == uob.id){
            return true;
        }else{
            return false;
        }
    }
}