package com.itheima.a01abstractdemo01;

public abstract class Person {
    private String name;
    private int age;

    public abstract void work();
    public void sleep(){
        System.out.println("睡觉");
    }
    //抽象类不能创建对象，但是它的子类可以，所以可以有构造方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
