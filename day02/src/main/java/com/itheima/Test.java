package com.itheima;

public class Test {

    public static void main(String[] args) {
        Student stu = new Student("sd", 23);
        //Student.learn();
        stu.learn();
        stu.setAge(24);
        System.out.println( stu.getAge());
        int a = 10;
        int b = 10;
        int c = add(a , b);
        System.out.println(c);
    }
    public static int  add(int a, int b){
        int c = a + b;
        return c;
    }
}
