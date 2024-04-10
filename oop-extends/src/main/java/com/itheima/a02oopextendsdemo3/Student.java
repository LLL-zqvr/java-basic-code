package com.itheima.a02oopextendsdemo3;

public class Student extends Person{
    public void eat(){

    }
    public void lunch(){
        //先在子类查看有没有eat()和drink()，若有则调用；若无则调用父类的
        eat();
        drink();
    }
}
