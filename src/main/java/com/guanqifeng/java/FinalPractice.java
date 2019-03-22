package com.guanqifeng.java;

/**
 * final练习：
 * 1.final修饰变量：被修饰的变量不可改变。一旦赋予了初值，就不能被重新赋值。（常量）
 * 2.final修饰方法：被修饰的方法不能被子类重写，但可以被重载。
 * 3.final修饰类：被修饰的类可能被继承。
 */
public class FinalPractice {
    public void print(){
        System.out.println("This is final class!");
    }
    public final void testFinal(){ //final修饰的方法时可以被重载的
        System.out.println("This is a Final Test!");
    }
    void testFinal(String game){
        System.out.println("Playing some game is :"+game);
    }

    public static void main(String[] args) {
        FinalPractice fp = new FinalPractice();
        fp.testFinal();
        fp.testFinal("Basketball");
    }
}
final class  ExtendTest extends FinalPractice{
   /*public void testFinal(){ // 父类的final方法不能被重写
   }*/
   public void testFinal(String game){
       super.testFinal(game);
       System.out.println("This is SubClass Test"); //可以直接重写
   }
   public void print(){
       super.print();
       System.out.println("This is SubClass print"); //可以直接重写
   }
}

/*class ExtendFinalTest extends  ExtendTest{ //final类不能继承ExtendTest

}*/
