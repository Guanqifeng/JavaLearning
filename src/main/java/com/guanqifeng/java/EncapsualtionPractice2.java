package com.guanqifeng.java;

/**
 * 封装实例
 * 1.属性全部私有，为属性提供get和set方法
 * *****无复杂逻辑功能的类：JavaBean
 */
public class EncapsualtionPractice2 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EncapsualtionTest{
    public static void main(String[] args) {
        EncapsualtionPractice2 e = new EncapsualtionPractice2();
        e.setId(10);
//        e.id = 10;//属性私有不可以直接赋值
        System.out.println(e.getId());
    }
}