package com.itheima;

public class RedGreenYellowLight {
    public static void main(String[] args){
        //红灯停止
        //绿灯行驶
        //黄灯减速
        //true亮,false灭
        boolean RedLight = false;
        boolean GreenLight = true;
        boolean YellowLight = false;
        if(RedLight){
            System.out.println("Stop!!!");
        }
        if(GreenLight){
            System.out.println("Go!!!");
        }
        if(YellowLight){
            System.out.println("Slow!!!");
        }
    }
}
