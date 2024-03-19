package com.itheima;

public class MethodDemo4 {
    public static void main(String[] args){
        //带返回值的方法的定义和调用格式
        //计算总和
       int sum1 = getSum(10,20,30);
       int sum2 = getSum(20,30,40);
       int sum3 = getSum(30,40,50);
       int sum4 = getSum(40,50,60);
       int result = sum1 + sum2 + sum3 + sum4;
        System.out.println(result);
    }
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
