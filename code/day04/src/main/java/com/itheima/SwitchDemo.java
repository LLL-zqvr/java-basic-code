package com.itheima;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数代表星期:");
        int week = sc.nextInt();
        switch(week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个选项");
        }
    }
}
