package com.itheima.test2;

public class GirlFriend {
    //属性
   private String name;
   private int age;
   private String gender;
   //name的set,给成员赋值
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int n){
        if(n >=18 && n <=28){
            age = n;
        }else{
            System.out.println("非法数据");
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String n){
        gender = n;
    }
    public String getGender(){
        return gender;
    }
    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
