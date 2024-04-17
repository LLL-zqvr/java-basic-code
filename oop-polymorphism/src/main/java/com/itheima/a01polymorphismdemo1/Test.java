package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("小诗诗");
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("王老师");
        Administrator adm = new Administrator();
        adm.setAge(45);
        adm.setName("管理员");
        register(student);
        register(teacher);
        register(adm);

    }
    //该方法既能接收老师，又能接收学生，还能接收管理员
    //所以只能把参数写成三个类型的父类
    public static void register(Person person){
        person.show();
    }
}
