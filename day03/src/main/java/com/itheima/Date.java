package com.itheima;

import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的衣服时髦度：");
        int me = sc.nextInt();
        System.out.println("请输入对象的衣服时髦度：");
        int partner = sc.nextInt();
        if(me >= partner)
            System.out.println("匹配成功");
        else
            System.out.println("匹配失败");


    }
}
