package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args){
        //猜数字
        //获取一个随机数
        //范围为0~100
        Random r = new Random();
        int number = r.nextInt(101);
        System.out.println(number);
        System.out.println("请输入您想要挑战的次数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("设置成功！请输入您要猜的数字:");
        int flag = 0;
        while (n > 0){
            int guessNumber = sc.nextInt();
            if(number == guessNumber){
                System.out.println("恭喜您，猜对啦！");
                flag = 1;
                break;
            } else if (guessNumber < number) {
                System.out.println("太小了");
                n--;
            } else {
                System.out.println("太大了");
                n--;
            }


        }
        if(n == 0 && flag == 0){
            System.out.println("您的次数已用完，本次正确数字是：" + number);
        }
    }
}
