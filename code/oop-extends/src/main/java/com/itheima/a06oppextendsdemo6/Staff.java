package com.itheima.a06oppextendsdemo6;

public class Staff {
    private String id;
    private String name;
    private int salary;
    public Staff(){}
    public Staff(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void work(){

    }
    public void eat(){
        System.out.println("吃米饭");
    }

}
