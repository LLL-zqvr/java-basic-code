package com.itheima.a06oppextendsdemo6;

public class Test {
    public static void main(String[] args) {
        Manager man = new Manager("w3424","sjaf",345,123);
        System.out.println(man.getId() + man.getName() + man.getPrize() + man.getSalary());
        Chef ch = new Chef("242wd","sss", 234);
        System.out.println(ch.getId() + ch.getName() + ch.getSalary());
    }
}
