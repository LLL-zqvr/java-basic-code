package com.itheima;

public class ForcedConversion {
    public static void main(String[] args){
        double a = 12.3;
        int b = (int)a;
        System.out.println(b);
        //导致数值错误
       int c = 300;
       byte d = (byte)c;
        System.out.println(d);

    }
}
