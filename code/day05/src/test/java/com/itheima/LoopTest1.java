package com.itheima;

public class LoopTest1 {
    //逢七过———— 打印一到一百，如果数字是七或者是七的倍数或者包含七，就喊过。
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 7 != 0 && i / 10 != 7 && i % 10 != 7){
                System.out.println(i);
            }else{
                System.out.println("过");
            }
        }
    }
}
