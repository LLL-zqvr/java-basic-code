package com.itheima.a04interfacedemo4;

public abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();

}
