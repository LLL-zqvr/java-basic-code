package com.itheima;

import java.util.Scanner;

public class ScoreAndGift {
    public static void main(String[] args) {
        /*95~100自行车
        90~94去游乐场
        80~89变形金刚玩具
        80以下七匹狼
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();
        if(score >= 95 && score <= 100){
            System.out.println("送一辆自行车");
        }else if(score <= 94 && score >= 90){
            System.out.println("去游乐场");
        }else if(score <= 89 && score >= 80){
            System.out.println("送一个变形金刚玩具");
        } else if(score <80 && score >= 0){
            System.out.println("七匹狼伺候");
        }else{
            System.out.println("数据错误，请重新输入分数");
        }

    }
    }
