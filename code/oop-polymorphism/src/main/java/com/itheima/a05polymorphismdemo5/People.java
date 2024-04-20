package com.itheima.a05polymorphismdemo5;

public class People {
    private String name;
    private int age;
    public void keepAnimal(Animal a){
     if(a instanceof Dog d){
         System.out.println("养了一只" + a.getColor() + "狗");
         a.eat();
     } else if (a instanceof Cat c) {
         System.out.println("养了一只" + a.getColor() + "猫");
         a.eat();
     }
    }
}
