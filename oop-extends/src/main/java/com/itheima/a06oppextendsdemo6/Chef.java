package com.itheima.a06oppextendsdemo6;

public class Chef extends Staff{
    public Chef(){
        super();
    }
    public Chef(String id, String name, int salary){
        super(id, name, salary);
    }
    public void work(){
        System.out.println("炒菜");
    }
}
