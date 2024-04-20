package com.itheima;

import java.util.Scanner;

public class If {
    public static void main(String[] args){
        //需求：键盘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();
        if(wine > 2){
            System.out.println("我认可你");
        }


        }
    }
