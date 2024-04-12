package com.itheima.a03oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
        OverseasStudent s2 = new OverseasStudent();
        s2.lunch();
    }

}

class Person {
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}
class Student extends Person{
    public void eat(){

    }
    public void lunch(){
        //先在子类查看有没有eat()和drink()，若有则调用；若无则调用父类的
        super.eat();
        drink();
    }
}
class OverseasStudent extends Person{
    public void lunch (){
        this.eat();
        this.drink();
        super.eat();
        super.drink();
    }
    public void eat(){
        System.out.println("吃意大利面");
    }
    public void drink(){
        System.out.println("喝凉水");
    }
}