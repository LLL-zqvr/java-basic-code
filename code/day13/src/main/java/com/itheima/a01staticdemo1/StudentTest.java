package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //只要Student类里，teacherName是静态的，那么s1赋值了，s2也共享了值
        s1.teacherName = "阿伟老师";
        s1.study();
        s1.show();
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setGender("女");
        s2.study();
        s2.show();

    }

}
