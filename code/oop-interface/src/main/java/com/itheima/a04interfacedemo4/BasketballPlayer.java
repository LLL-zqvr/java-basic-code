package com.itheima.a04interfacedemo4;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习");
    }
}
