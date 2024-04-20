package com.itheima.a05polymorphismdemo5;

public class Cat extends Animal{
    public void eat(){
        System.out.println("修猫在吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("修猫在抓老鼠，可爱捏");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
}
