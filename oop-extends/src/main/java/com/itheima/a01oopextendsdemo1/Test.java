package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //创建布偶猫的对象
        Ragdoll ra = new Ragdoll();
        ra.catchMouse();
        ra.eat();
        ra.drink();
        System.out.println("-------------------------------");
        //创建泰迪的对象
        Husky h = new Husky();
        h.eat();
        h.breakHome();
        h.drink();
        h.drink();
        h.lookHome();

    }
}
