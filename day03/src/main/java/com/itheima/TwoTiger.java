package com.itheima;

import java.util.Scanner;

public class TwoTiger {
    //动物园有俩只老虎，看看它们体重是否相同,体重通过键盘输入
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        double tiger1 = sc.nextDouble();
        System.out.println("请输入第二只老虎的体重：");
        double tiger2 = sc.nextDouble();
        System.out.println(tiger1 == tiger2 ? "相同" : "不相同");
    }

}
