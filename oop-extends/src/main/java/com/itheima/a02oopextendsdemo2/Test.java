package com.itheima.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        Zi zi = new Zi();

    }
}
class Fu {
    String name;
    int age;
    public Fu(){}
    public Fu(String name, int age){
       this.name = name;
       this.age = age;
    }
}
class Zi extends Fu{

}