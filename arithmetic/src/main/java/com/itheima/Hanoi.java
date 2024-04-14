package com.itheima;

public class Hanoi {
    public static void hanoi(Integer n, String a,String b,String c){
        if(n == 1){
            System.out.println(a + "移动到" + c);
        }else{
            hanoi(n - 1,a, c, b);
            System.out.println(a + "移动到" + c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        hanoi(3, "塔1", "塔2", "塔3");
    }
}
