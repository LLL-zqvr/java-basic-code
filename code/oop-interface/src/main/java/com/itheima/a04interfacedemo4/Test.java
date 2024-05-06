package com.itheima.a04interfacedemo4;

public class Test {
    /*
    乒乓球运动员： 姓名，年龄，学打乒乓球，说英语
    篮球运动员：姓名，年龄，学打篮球
    乒乓球教练：姓名，年龄，教打乒乓球，说英语
    篮球教练：姓名，年龄，教打篮球
     */
    public static void main(String[] args) {
        PingPangPlayer player = new PingPangPlayer("刘诗雯", 23);
        System.out.println(player.getName() + ", " + player.getAge());
        player.speakEnglish();
        player.study();
    }

}
