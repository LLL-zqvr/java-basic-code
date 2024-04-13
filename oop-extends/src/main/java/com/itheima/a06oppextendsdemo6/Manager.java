package com.itheima.a06oppextendsdemo6;

public class Manager extends Staff{
    private int prize;
    public Manager(){
        super();
    }
    public Manager(String id, String name, int salary, int prize){
        super(id,name,salary);
        this.prize = prize;
    }
    public int getPrize(){
        return prize;
    }
    public void setPrize(int prize){
        this.prize = prize;
    }
    public void work(){
        System.out.println("管理其他人");
    }
}
