package com.guanqifeng.java;

/**
 * super是直接父类对象的引用，可以通过super来访问父类中被子里覆盖的方法或属性。
 * 1.使用super调用普通方法，语句没有位置限制，可以在子类中随便使用
 * 2.若是构造方法的第一行大妈没有显式的调用super()或者this(),那么java都会默认添加super(),
 *   含义是调用父类的无参构造方法，这里的super()可以省略。
 * 继承树的追溯：（初始化ChildClass时）
 * 调度：new ChildClass()=》ChildClass构造器=》FatherClass无参构造器=》Object无参构造器
 * 返回：Object构造器返回结果及其对象=》FatherClass构造器返回结果及其对象=》ChildClass构造器返回结果及对象
 * ***注：a.所以ChildClass的对象可以使用FatherClass类和Object类的所有属性及方法
 *       b.静态初始化块的调用顺序与构造方法调用顺序一样。
 */
public class SuperPractice {
    public static void main(String[] args) {
        ChildClass c = new ChildClass(300);
        c.printValue();
    }
}
class FatherClass{
    public int value;
    public void printValue(){
        value = 100;
        System.out.println("Father's value is "+value);

    }
    public FatherClass(){
        System.out.println("Father has been inited!");
    }
}

class ChildClass extends FatherClass{
    public int value;
    public void printValue(){
        super.printValue();
        value = 200;
        System.out.println("Child's value is "+value);
        System.out.println("Use The Father Class Value is:"+super.value);
    }
    public ChildClass(){
        //super(); //此处java默认提供super()，调用父类构造器
        System.out.println("Child has been inited");
    }
    public ChildClass(int value){
        //super();
        this();  //此处java不提供super()，因为有this（）出现
        this.value = value;
        System.out.println("Child has been inited and value is "+value);
    }
}
