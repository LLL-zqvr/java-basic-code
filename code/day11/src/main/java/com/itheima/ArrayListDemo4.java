package com.itheima;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //整数类型的数据遍历
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
