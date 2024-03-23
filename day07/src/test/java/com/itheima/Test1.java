package com.itheima;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        //卖飞机票——5~10月头等舱9折，经济舱8.5折；11~4月头等舱7折，经济舱6.5折
        //输入票价，月份，头等舱/经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票价：");
        double ticket = sc.nextDouble();
        System.out.println("请输入出行月份：");
        int month = sc.nextInt();
        System.out.println("请输入座位类型：（头等舱/经济舱）");
        String set = sc.next();
        //System.out.println(set);
        switch(month){
            case 5,6,7,8,9,10 :
                //中文字符串用equals更好比较
                if(set.equals("头等舱")){
                    ticket = ticket * 0.9;
                    System.out.println("头等舱，票价为：" + ticket);
                }else{
                    ticket = ticket * 0.85;
                    System.out.println("经济舱，票价为：" + ticket);
                }
                break;
            case 1,2,3,4,11,12 :
                if(set.equals("头等舱")){
                    ticket = ticket * 0.7;
                    System.out.println("头等舱，票价为：" + ticket );
                }else{
                    ticket = ticket * 0.65;
                    System.out.println("经济舱，票价为：" + ticket);
                }
                break;
        }


    }
}
