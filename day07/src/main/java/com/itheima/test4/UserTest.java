package com.itheima.test4;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        user1.setUsername(name);
        System.out.println("请输入密码：");
        String password = sc.next();
        user1.setPassword(password);
        System.out.println("请输入邮箱：");
        String email = sc.next();
        user1.setEmail(email);
        System.out.println("请输入性别：");
        String gender = sc.next();
        user1.setGender(gender);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        user1.setAge(age);
        System.out.println("用户名：" + user1.getUsername());
        System.out.println("密码：" + user1.getPassword());
        System.out.println("email：" + user1.getEmail());
        System.out.println("性别：" + user1.getGender());
        System.out.println("年龄：" + user1.getAge());
    }
}
