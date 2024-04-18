package com.itheima.a04polymorphismdemo4;

public class Student extends Person{
    public void study(){
        System.out.println("学生在学习");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
