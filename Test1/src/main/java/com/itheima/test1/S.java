package com.itheima.test1;

import com.itheima.test1.F;

public class S extends F {
    public void getS() {
        System.out.println("S getS");
    }

    @Override
    public void getF() {
        System.out.println("S getF");
    }

    @Override
    public void getI() {
        System.out.println("S getI");
    }
}