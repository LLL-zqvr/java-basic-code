package com.itheima;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //2.删除元素,根据值来删除
        boolean result1 = list.remove("aaa");
        //3.删除元素，根据索引来删除
        list.remove(0);
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //修改元素,被修改元素也会返回
        String result = list.set(1,"ddd");
        //查询元素
        String s = list.get(0);
        //遍历
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
