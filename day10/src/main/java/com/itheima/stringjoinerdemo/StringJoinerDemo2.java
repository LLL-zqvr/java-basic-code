package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner("-","[","]");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //2.1打印长度
        int len = sj.length();
        System.out.println(len);
        //3.打印
        System.out.println(sj);
        //4.转成字符串
        String str = sj.toString();
        System.out.println(str);
    }
}
