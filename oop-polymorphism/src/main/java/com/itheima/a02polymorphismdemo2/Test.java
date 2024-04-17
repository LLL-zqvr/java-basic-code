package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态方式）
        //Fu f = new Zi();
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边。
        //编译看左边：javac编译代码时，会看左边的父类有没有这个变量（如下面要调用name），若有则编译成功，若没有则编译失败。
        //运行看左边：java运行代码时，实际获取的就是左边父类成员变量的值。
        System.out.println(a.name);
        //调用成员方法：编译看左边，运行看右边
        //编译看左边：javac编译代码时，会看左边的父类有没有这个方法，若有则编译成功，反之则编译失败
        //运行看右边：java运行代码时，实际运行的是子类中的方法
        a.show();

    }
}
class Animal{
    String name = "动物";
    public void show(){
        System.out.println("Animal --- show 方法");
    }
}
class Dog extends Animal{
    String name = "狗";
    public void show(){
        System.out.println("Dog --- show 方法");
    }

}
class Cat extends Animal{
    String name = "猫";
    public void show(){
        System.out.println("Cat --- show 方法");
    }
}