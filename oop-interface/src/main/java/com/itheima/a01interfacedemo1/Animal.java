package com.itheima.a01interfacedemo1;

public abstract class Animal {
    //青蛙      属性：名字，年龄      行为：吃虫子，蛙泳
    // 狗        属性：名字，年龄     行为：吃骨头，狗刨
    //兔子      属性：名字，年龄      行为：吃胡萝卜
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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
    //三种动物都有吃的行为，定义一个吃的方法
    //但是吃的具体实现是不同的，所以吃的方法无方法体
    //无方法体的是抽象的方法，抽象方法所在类必须是抽象类，所以前面的Animal类要加上abstract
    //狗和青蛙都会游泳，但是兔子不会，所以游泳要写在接口
    public abstract void eat();
}
