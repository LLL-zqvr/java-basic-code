package com.itheima.a01abstractdemo01;

public class Student extends Person{
    //别忘了子类的构造函数
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
