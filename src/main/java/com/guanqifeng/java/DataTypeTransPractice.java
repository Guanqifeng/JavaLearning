package com.guanqifeng.java;

/**
 * 测试类型转换（容量小的类型可以自动转化为容量大的类型）
 * byte（、short、char）=》 int=》 long =》float =》double
 * 大范围的类型可以强制转换为小范围的类型，会有数据丢失
 */
public class DataTypeTransPractice {
    public static void main(String[] args) {
        int  a = 32;
        long l = 19282929L;
        //byte s = 331;//超过了 byte 类型的范围
        byte s1 = 19; // 特例，int类型可以自动转化为byte类型，只要不超出byte的数据范围
        char c = 98; //同上
        short s = 8900;//同上
        float f = l; // 自动转换，但不精确
        double d = a; // 自动转换，但不精确
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        /*
        强制转换
         */
        double dd = 283102.393;
        //int x = dd; //为进行强制转换是不合法的
        int x = (int)dd; //将double强制转换为int类型,精度丢失
        System.out.println(x);

        /*
        在计算时，注意数据溢出的问题
         */
        int money = 1000000000; //10亿
        int years= 20;
        int total = money*years;  //int与int进行计算，结果为int类型
        System.out.println(total);
        long total2 = money*years; //int与int进行计算，结果为int类型，自动转为long，但为时已晚
        System.out.println(total2);
        long total3 = money*(long)years; //将其中一个数强转为long，返回结果为long类型，不超范围
        System.out.println(total3);
    }
}
