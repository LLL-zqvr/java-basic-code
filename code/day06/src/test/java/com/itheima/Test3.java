package com.itheima;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        //判断一个数在数组中存不存在。返回true,false
        int[] arr = {34,23,15,56,48,89};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的数字:");
        int num = sc.nextInt();
        boolean flag = contains(arr,num);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr,int num){
        for(int i = 0;i < arr.length;i++){
            if(num == arr[i]){
                return true;//return与循环没有太大关系，表示的是结束方法，返回结果
            }
        }
        return false;
    }
}
