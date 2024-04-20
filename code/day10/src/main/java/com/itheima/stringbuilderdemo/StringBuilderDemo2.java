package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //字符串的反转
        //键盘键入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //反转
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);

    }
}
