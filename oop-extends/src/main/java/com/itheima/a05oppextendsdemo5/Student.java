package com.itheima.a05oppextendsdemo5;

public class Student extends Person{
    //子类构造方法隐藏的super()去访问父类的构造方法
    public Student(){
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age){
        super(name, age);

    }
}
