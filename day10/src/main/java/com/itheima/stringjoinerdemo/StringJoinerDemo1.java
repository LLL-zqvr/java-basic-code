package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //创建一个对象，并指定间隔符号
        StringJoiner sj = new StringJoiner("---");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //3.打印
        System.out.println(sj);
    }
}
