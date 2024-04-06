package com.itheima.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
        //添加元素
        sb.append("sfs");
        sb.append(true);
        sb.append(243);
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
        //把StringBuilder改成字符串
        String str = sb.toString();
        System.out.println(str);

    }


}
