package com.itheima;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args){
        //两数相加
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        getSum(num1, num2);
    }
    public static void getSum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
