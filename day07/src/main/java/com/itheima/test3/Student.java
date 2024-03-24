package com.itheima.test3;

public class Student {
    //属性
    private String name;
    private int age;
    //构造函数
    //空参构造
    public Student(){
        System.out.println("看看我执行了吗？");
    }
    //带参构造
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age >= 10 && age <= 20){
            this.age = age;
        }else{
            System.out.println("数据错误");
        }
    }
    public int getAge(){
        return age;
    }

}
