package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    //手机号的隐私保护
    //只有前三位和后四位保留，其他的都是*
    public static void main(String[] args) {
        //获取一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十一位手机号码");
        String number = sc.next();
        //截取手机前三位
        String start = number.substring(0,3);
        //截取手机号后四位
        String end = number.substring(7);
        String newNumber = "";
        newNumber = start + "****" + end;
        System.out.println(newNumber);



    }
}
