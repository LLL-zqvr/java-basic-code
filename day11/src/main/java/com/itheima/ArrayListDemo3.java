package com.itheima;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //定义一个集合，添加字符串，并进行遍历
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加字符串
        list.add("aaa");
        list.add("bcx");
        list.add("cdf");
        //3.遍历
        for(int i = 0; i <list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
