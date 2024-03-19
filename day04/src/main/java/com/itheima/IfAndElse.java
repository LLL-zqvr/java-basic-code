package com.itheima;

import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args){
        //商品为600元，键盘录入身上持有的金额，超过600则购买成功，不然失败
        Scanner sc = new Scanner(System.in);
        final int Price = 600;
        System.out.println("请输入身上所带的金额:");
        int wallet = sc.nextInt();
        if (wallet >= Price){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }

    }
}
