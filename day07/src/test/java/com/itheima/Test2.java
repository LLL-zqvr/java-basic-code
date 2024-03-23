package com.itheima;

import java.util.Random;

public class Test2 {
    public static void main(String[] args){
        //使用代码随机产生一个五位验证码
        //验证码前四位是大写字母或者小写字母，最后一位是数字
        char[] arr = new char[52];

        for(int i = 0; i < arr.length; i++){
            //使用ASCII码表，利用数字与字母的对应关系将数字强制转换成字母。
            if(i <= 25){
                //a-----97
            arr[i] = (char)(97 + i);
            }else{
                //A------65
                arr[i] = (char)(65 + i - 26);//减26是因为i是从26开始
            }

        }
        /*打印出大写字母和小写字母
        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */

        Random r = new Random();
       for(int i = 0; i < 4; i++){
           int randomIndex = r.nextInt(arr.length);
           System.out.print(arr[randomIndex]);
       }
       int number = r.nextInt(10);
        System.out.print(number);
    }
}
