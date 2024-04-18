package com.itheima.a05polymorphismdemo5;

public class Dog extends Animal{
    public void eat(){
        System.out.println("修狗在吃骨头");
    }
    public void lookHome(){
        System.out.println("修狗在看家，卡瓦");
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
}
