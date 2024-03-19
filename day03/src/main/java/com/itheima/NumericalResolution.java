package com.itheima;

import java.util.Scanner;

public class NumericalResolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数:");
        int i = sc.nextInt();
        System.out.println("个位是：" + i/100%10);
        System.out.println("十位是：" + i/10%10);
        System.out.println("百位是：" + i%10);


    }
}
