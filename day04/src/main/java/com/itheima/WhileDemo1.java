package com.itheima;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args){
        //判断一个数字是不是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的数字：");
        int number = sc.nextInt();
        int x = number;
        int num = 0;
        int unit = 0;//记录下x的个位数
        while(x != 0){
            unit = x % 10;
            x = x / 10;
            num = num * 10 + unit;
        }
        if (number == num){
            System.out.println("这是一个回文数");
        }
        else{
            System.out.println("这不是回文数");
        }

    }
}
