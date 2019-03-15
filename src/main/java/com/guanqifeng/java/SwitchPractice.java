package com.guanqifeng.java;

/**
 * switch 用于整数也可以是枚举，在JDK1.7之后，支持字符串类型数据作为判断内容
 */
public class SwitchPractice {
    public static void main(String[] args) {
//        int month = (int) (12 * Math.random() + 1);
//        System.out.println("月份为："+month);
//        switch (month){
//            case 1:
//                System.out.println("1月份，新年快乐！");
//                break;
//            case 2:
//                System.out.println("2月份，开春了！");
//                break;
//            default:
//                System.out.println("其他月份");
//                break;
//        }
        char c = 'a';
        char result = (char) (c + (int)(26*Math.random()));
        System.out.println(result);
        switch (result){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("为元音字母");
                break;
            case 'y':
            case 'w':
                System.out.println("为半元音字母");
                break;
            default:
                System.out.println("为非元音字母");
        }
    }
}
