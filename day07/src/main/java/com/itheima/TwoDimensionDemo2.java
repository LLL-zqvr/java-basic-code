package com.itheima;

public class TwoDimensionDemo2 {
    public static void main(String[] args){
        //二维数组的动态初始化
        int[][] arr = new int[3][4];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
