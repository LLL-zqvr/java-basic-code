package com.itheima.a04oppextendsdemo4;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h = new Husky();
        h.eat();
        h.breakHome();
        h.drink();
        h.lookHome();
        System.out.println("----------------------------");
        RuralDog rd = new RuralDog();
        rd.eat();
        rd.drink();
        rd.lookHome();
        System.out.println("---------------------------");
        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();

    }


}
