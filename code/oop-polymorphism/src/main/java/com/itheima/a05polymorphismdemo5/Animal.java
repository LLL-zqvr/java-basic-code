package com.itheima.a05polymorphismdemo5;

public class Animal {
    private int age;
    private String color;
    public void eat(){
        System.out.println("小动物在吃东西");
    }
    public Animal(){}
    public Animal(int age, String color){
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
