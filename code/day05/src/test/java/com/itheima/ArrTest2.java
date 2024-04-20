package com.itheima;

import java.util.Random;

public class ArrTest2 {
    //随机获取五个数，打出它们的值并得到最大值
    public static void main(String[] args){
        Random r = new Random();
        int []arr = new int[5];
        System.out.println("这五个数是：");
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
            System.out.println(arr[i]);
        }
        int max = arr[0] ;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值是："+max);

    }
}
