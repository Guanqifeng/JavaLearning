package com.guanqifeng.java;

import java.math.BigDecimal;

/**
 * 基础数据类型
 * 整型：byte(1个字节)、short(2个字节)、int(4个字节)、long(8个字节)
 * 浮点型：float(4个字节)、double(8个字节)
 * 字符型：char(2个字节) 可允许有65536个字符--unicode编码
 * 布尔型：boolean（1位）
 */
public class PrimitiveDataTypePractice {
    public static void main(String[] args) {
        /*
       整型：
       1.byte 1个字节  -128~127
       2.short 2字节   大约：-30000~30000
       3.int 4个字节 大约 大约：-200000000~200000000 //整型常量默认为int类型
       4.long 8 个字节  大约：  //当时用Long的时候需要在整型常量后+L （一般用大写 L）
       */
        int a = 15;
        int b = 015;
        int c = 0X15;
        long d = 10000000L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        /*
           java浮点类型常量有两张表示方法：
             1.十进制表示法，例如：3.14,3.140
             2.科学计数法形式，例如：314e2
           float: 4个字节 //java浮点类型常量默认数据类型为double，所以使用float时需要显示标记
           double: 8个字节
         */
        double xx = 3.14;
        double xxx = 314e2;
        double xxxx = 314e-2;
        float f = 3.14f;  //显示标记float类型
        float f2 = 314e-2f;
        double ss = 0.1;

        BigDecimal salary1 = new BigDecimal(32.0);
        BigDecimal salary2 = new BigDecimal(31.5);
        salary1 = salary1.subtract(BigDecimal.valueOf(0.1));
        salary1 = salary1.subtract(BigDecimal.valueOf(0.1));
        salary1 = salary1.subtract(BigDecimal.valueOf(0.1));
        salary1 = salary1.subtract(BigDecimal.valueOf(0.1));
        salary1 = salary1.subtract(BigDecimal.valueOf(0.1));
        System.out.println(xx);
        System.out.println(xxx);
        System.out.println(xxxx);
        System.out.println(f);
        System.out.println(f2);
        System.out.println(ss == 1/10); //基础数据类型中的浮点数不精确，不要进行比较，容易丢失
        System.out.println(salary1);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(salary2.equals(salary1));
        /*
          char 测试 2个字节
         */
        char t = 'T';
        char tt = '尚';
        char ca = '\u0061';
        System.out.println(t);
        System.out.println(tt);
        System.out.println(ca);
        System.out.println('a'+'b'); //穿换成对应的ascii码进行相加，结果为数字
        System.out.println(""+'a'+'b');
        System.out.println(""+'a'+'\n'+'b');//转义字符也是char
        System.out.println('a'+"\n"+'b'); //这里的"\n" 为字符串类型

        /*
        boolean :占一位 内容：true 、 false
         */
        boolean man = true;
        if(man){
            System.out.println("this is a man!");
        }
    }
}
