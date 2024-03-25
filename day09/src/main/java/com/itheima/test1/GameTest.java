package com.itheima.test1;

public class GameTest {
    public static void main(String[] args){
        //创建两个角色
        Role role1 = new Role("原批",10000);
        Role role2 = new Role("崩批",10000);
        while (true){
            //role1攻击role2
            role1.attack(role2);
            if(role2.getBlood() == 0){
                System.out.println(role1.getName() + "KO了" + role2.getName() + "! ! !");
                //System.out.println("恭喜" + role1.getName() + "打赢了复活赛！ ！ ！");
                System.out.println("鉴定为玩崩铁玩的（龙王憋笑.jpg）");
                break;
            }
            //role2攻击role1
            role2.attack(role1);
            if(role1.getBlood() == 0){
                System.out.println(role2.getName() + "KO了" + role1.getName() + "! ! !");
                //System.out.println("恭喜" + role2.getName() + "打赢了复活赛！ ！ ！");
                System.out.println("鉴定为玩原神玩的（龙王憋笑.jpg）");
                break;
            }
        }

    }
}
