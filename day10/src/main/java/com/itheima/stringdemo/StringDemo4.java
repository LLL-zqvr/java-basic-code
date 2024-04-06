package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //遍历字符串
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.printf(c + " ");
        }

    }
}
