package com.itheima.Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("001","yumu001","123456");
        User user2 = new User("002","yumu002","123456");
        User user3 = new User("003","yumu003","123456");
        User user4 = new User("004","yumu004","123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id:");
        String str = sc.next();
        boolean result = contains(list,str);
        System.out.println(result
        );



    }
    public static boolean contains(ArrayList<User> list, String id){
        for(int i = 0; i < list.size(); i++){
           if((list.get(i).getId().equals(id))){
               return true;
            }

        }
        //循环结束还没找到就返回false
        return false;
    }
}
