package com.itheima;

public class Logicoperator02 {
    public static void main(String[] args){
        //先是短路运算符&&
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        //然后是普通运算符&
        a = 10;
        b = 10;
         result = ++a < 5 & ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
