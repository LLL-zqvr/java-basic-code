package com.itheima;

public class ArrTest1 {
    public static void main(String[] args){
        //找出最大值
        int [] arr = {33,5,22,44,55};
        int max = arr[0];
        for(int i =0; i < arr.length; i++){
            if(max >= arr[i])
                max = arr[i];
        }
        System.out.println("最大值是:" + max);

    }

}
