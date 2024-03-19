package com.itheima;

public class ArrTest3 {
    public static void main(String[] args){
        //将1，2，3，4，5存入数组，并前后交换，达到5，4，3，2，1的效果
        int []arr = {1,2,3,4,5};
        for(int i = 0,j = arr.length - 1;i <= j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
