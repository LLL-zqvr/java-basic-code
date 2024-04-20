package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //已知正确的用户名和密码，请用程序实现模拟用户登录。总共三次机会，登录之后会给出相应提示
        //定义两个变量记录用户名及密码
        String rightUsername = "ZhangSan";
        String rightPassword = "123456";
        //键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            //3.比较
            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登录成功");
            }else{
                System.out.println("用户登陆失败，用户名或密码有误");
            }
        }

    }
}
