package com.itheima.a04interfacedemo4;

public abstract class Player extends Person{
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }

    public abstract void study();
}
