package com.itheima.test3;

public class StudentTest {
    public static void main(String[] args) {
        //带参构造
        //有些时候并不知道数据的类型（如某时键盘键入），则还是需要set
        Student student1 = new Student(18,"zhangsan");//自动调用了空参构造

        //student1.setName("xiaoshishi");
        //student1.setAge(18);
        System.out.println(student1.getAge());
        System.out.println(student1.getName());


    }
}
