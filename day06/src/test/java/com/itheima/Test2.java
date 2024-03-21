package com.itheima;

public class Test2 {
    //数组的调用
    //定义方法实现数组的遍历
    public static void main(String[] args){
        int[] arr = {34,233,56,79,10};
        sortArr(arr);
    }
    public static void sortArr(int[] arr){
        for(int i = 0; i <= arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1;j++){
                if(arr[j] > arr[j + 1]){
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
