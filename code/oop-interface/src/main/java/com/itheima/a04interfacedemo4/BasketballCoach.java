package com.itheima.a04interfacedemo4;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教篮球");
    }
}
