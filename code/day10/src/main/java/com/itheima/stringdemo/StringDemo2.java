package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        //'=='在基本数据类型中比较的是值，在引用数据类型的是地址
        System.out.println(str1 == str2);

    }
}
