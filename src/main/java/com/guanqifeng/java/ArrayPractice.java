package com.guanqifeng.java;

/**
 * 数组练习：
 * 数组是相同类型数据的有序集合。数组描述的是相同类型的若干个数据，按照一定的先后次序排列组合而成。
 * 期中，每一个数据称作一个元素，每个元素可以通过一个索引（下标）来访问他们。
 * 数组的三个基本特点：
 * 1.长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
 * 2.其元素必须是相同类型，不允许出现混合类型。
 * 3.数组类型可以是任何数据类型，包括基本类型和引用类型。
 * 数组的三种初始化：
 * 1.静态初始化：int[] arr01 = {1,2,3}
 * 2.默认初始化：int[] arr02 = new int[3]; =>各元素已被初始化为默认值，同成员变量
 * 3.动态初始化：int[] arr03 = new int[3]; arr03[0] = 30; =>动态指定下标并赋值
 */
public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr01 ;
        String arr02[];
        ArrayUser[] arr03;
        //初始化数组范围（也就是数组长度），数组下标从0开始
        arr01 = new int[10];
        arr02 = new String[6];
        arr03 = new ArrayUser[3];

        //第一种赋值方式，指定下标并赋值
        arr01[0] = 10;
        arr01[1] = 20;
        arr01[2] = 30;
        System.out.println("第一个int型数组为："+arr01[2]);
        //第二种赋值方式，遍历赋值
        for(int i = 0;i<arr02.length;i++){
            arr02[i] = String.valueOf(i*10);
        }
        System.out.println("第二个String型数组为："+arr02[1]);
        //指定长度，遍历赋值
        for(int i = 0;i<3;i++){
            arr03[i] = new ArrayUser(i,String.valueOf(i));
        }
        System.out.println("第一个ArrayUser型数组为："+arr03[0]);

        String[] arr04 = {"aa","bbb","ccc","ddd"};
        for(String s :arr04){
            System.out.println(s);
        }
    }


}

class ArrayUser{

    private int id;
    private String name;

    public ArrayUser(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("ArrayUser has been inited!");
    }
}
