package com.itheima;

public class ThreeBonzes {
    //三个和尚身高分别为：150，210，165，求最高身高
   public static void main(String[] args){
       int bonze1 = 150;
       int bonze2 = 210;
       int bonze3 = 165;
       int max = bonze1 > bonze2 ? bonze1 : bonze2;
       max = bonze2 > bonze3 ? bonze2 : bonze3;
       System.out.println(max);
   }
}
