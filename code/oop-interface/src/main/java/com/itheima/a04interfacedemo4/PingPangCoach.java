package com.itheima.a04interfacedemo4;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");

    }

}
