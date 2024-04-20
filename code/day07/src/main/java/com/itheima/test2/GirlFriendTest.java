package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("萌妹子");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();
        System.out.println("===================================");
        GirlFriend gf2 = new GirlFriend();
        gf2.setName("小澹澹");
        gf2.setAge(18);
        gf2.setGender("傲娇妹子");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.eat();
        gf2.sleep();



    }
}
