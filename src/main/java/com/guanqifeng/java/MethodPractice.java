package com.guanqifeng.java;

/**
 * 测试方法：
 *   方法就是一段用来完成特定功能的代码片段
 * 方法声明格式：
 *   [修饰符1 修饰符2 ....] 返回值类型 方法名(形式参数列表){
 *       java语句; .......
 *   }
 * 方法的调用方式：
 *   对象名.方法名(实参列表)
 *   详细说明：
 *   1.形式参数：在方法声明时，用于接受外界传入的数据。
 *   2.实参：调用方法时实际传给方法的数据。
 *   3.返回值：方法在执行完毕后返还给调用它的环境的数据
 *   4.返回值类型：事先约定的返回值的数据类型，如无返回值，必须显示指定为void
 *
 * ***方法时从属于类和对象的
 * ***注意事项：
 * 1.实参的数目、数据类型和次序必须和所调用的方法声明的形式参数列表匹配。
 * 2.return语句终止方法的运行并指定要返回的数据
 * 3.java中进行方法调用中传递参数时，遵循值传递的原则（传递的都是数据的副本）
 * 4.基本类型传递的是该数据自的copy值
 * 5.引用类型传递的是改对象引用的copy值，但指向的是同一个对象
 */
public class MethodPractice {
    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        mp.printFuncTest();
        System.out.println(mp.add(10,20,30));
    }
    void printFuncTest(){
        System.out.println("Function Print 1");
        System.out.println("Function Print 2");
        System.out.println("Function Print 3");
    }
    int add(int a,int b,int c){
        return a+b+c;  //含有两个意义：1.终止方法 2.返回结果
    }
}
