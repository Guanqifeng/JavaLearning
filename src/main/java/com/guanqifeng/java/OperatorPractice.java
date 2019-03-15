package com.guanqifeng.java;

/**
 * 运算符联系
 */
public class OperatorPractice {
    public static void main(String[] args) {
        /*
        算数运算符：
         */
        /*byte a = 1;
        int b = 2;
        //byte c = a+ b; //算术运算符用于整型时，如果没有long的情况下，返回结果为int类型
        int c = a+ b;
        System.out.println(c);
        long d = 1000L;
        //int e = b + d; //算术运算符用于整型时,如果有long的情况下，返回结果为long类型
        long e = b + d;
        System.out.println(e);

        float f1 = 9.23F;
        double g = 0.21;
        //float f2 = f1 + g; //算术运算符用于浮点型时，如果有其中一个为double类型的情况下，返回结果为double类型
        double g2 = f1 + g ;
        System.out.println(g2);
        float f2 = -7.32F;
        float f3 = f1 +f2;
        System.out.println(f3);//float与float运算，返回结果为float类型。

        int aa = 1;
        int bb = aa++;
        System.out.println(bb);
        int cc = ++aa;
        System.out.println(cc);*/

        /*
        赋值运算扩展：+= 、-= 、 /= 、*= 、%=
         */
        /*int a = 3;
        int b = 4;
        a += b;
        System.out.println(a);

        a *= b+3;
        System.out.println(a);*/

        /*
        关系运算符
         */
        /*int a = 3;
        System.out.println(a == 3);
        System.out.println(a != 8);
        System.out.println(a <= 5);

        char c = 'b';
        char c2 = 'c';
        System.out.println((int)c); //强转为int类型，转成字符对应的ASCII数字
        System.out.println(0+c2);  //利用数字与加号，转成字符对应的ASCII数字
        System.out.println(c > c2);
        System.out.println(c > 9);*/

        /*
        逻辑运算符： &（逻辑与）、|（逻辑或）、&&（短路与）、||（短路或）、！（非）、^(逻辑异或)
         */
        /*boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);
        int a = 10;
        int b = 20;
        if((a > 2)&(b++>20)){
            System.out.println("if1:"+b);
        }else{
            System.out.println("else1:"+b);
        }

        if((a < 2)&&(b++>20)){ //因为(a < 2)的结果为false，b++>20不会再执行，&&（短路与）
            System.out.println("if2:"+b);
        }else{
            System.out.println("else2:"+b);
        }*/
        /*
          位运算符
         */
        /*System.out.println(3*2);
        System.out.println(3<<1);
        System.out.println(12>>2);
        int a = 3;//0011
        int b = 4;//0100
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a | b);
        System.out.println(a & b);*/
        /*
        条件运算符（三元运算符）=>  x?y:z (x为条件，当x结果为true时，返回y，否则返回z)
         */
        System.out.println((1>2)?"A":"B");
        System.out.println((2>1)?'a':"b");
        //重点注意：
        /*
        1.（）》算数运算符》关系运算符》逻辑运算符
        2.逻辑非》逻辑与》逻辑或
         */
    }
}
