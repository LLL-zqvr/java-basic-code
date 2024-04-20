package com.itheima;

public class TwoDimensionDemo2 {
    public static void main(String[] args){
        //二维数组的动态初始化
        int[][] arr = new int[3][4];
        int[] arr1 = {2,3,4};
        arr[2] = arr1;
        System.out.println(arr[2][3]);//奇怪的是，单独打出这个值会显示越界
        //底下一起打出又没有显示出错误，没搞懂
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
