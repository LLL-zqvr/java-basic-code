package com.itheima;

import java.util.Scanner;

public class Test1 {
    //使用方法重载的思想，设计比较两个整数是否相同的方法
    //要兼容全整数：byte/short/int/long
    public static void main(String[] args){
        compare((byte)10,(byte)20);
        compare(22333L,44567L);
    }
    public static void compare(byte num1, byte num2){
        System.out.println("byte");
        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }
    }
    public static void compare(short num1, short num2){
        System.out.println("short");
        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }
    }
    public static void compare(int num1, int num2){
        System.out.println("int");
        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }
    }
    public static void compare(long num1, long num2){
        System.out.println("long");
        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }
    }
}
