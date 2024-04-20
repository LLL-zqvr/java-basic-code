package com.itheima.a05oppextendsdemo5;

public class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
