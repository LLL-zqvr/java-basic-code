package com.itheima.a04interfacedemo4;

public class PingPangPlayer extends Player implements English{

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangPlayer() {
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习");

    }
}
