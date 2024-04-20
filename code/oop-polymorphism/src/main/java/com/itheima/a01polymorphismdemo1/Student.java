package com.itheima.a01polymorphismdemo1;

public class Student extends Person{
    public void show(){
        System.out.println("学生的信息为:" + getName() + "," + getAge());
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
