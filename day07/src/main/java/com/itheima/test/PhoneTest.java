package com.itheima.test;

public class PhoneTest {

    public static void main(String[] args){
        //创建一个手机的对象
        Phone p = new Phone();
        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;
        System.out.println(p.brand + ":" + p.price);
        //调用手机的方法
        p.call();
        p.playGame();
    }
}
