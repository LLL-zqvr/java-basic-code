package com.itheima;

import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1~3:");
        int number = sc.nextInt();
        switch (number){
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("诶嘿");
            }

        }


    }
}
