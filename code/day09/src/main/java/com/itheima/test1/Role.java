package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    //构造函数
    //别忘了要有空参构造函数，还有全参构造函数
    public Role(){

    }
    public Role(String name, int blood){
        this.blood = blood;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法攻击别人
    //调用者攻击被调用者
    //Role role1 = new Role();
    //Role role2 = new Role();
    //role1.attack(role2);
    public void attack(Role role){
        //伤害随机，范围为1~20
        Random r = new Random();
        int hurt = r.nextInt(500) + 500;
        int remainBlood = role.getBlood() - hurt;
        //当血量为负，修改成0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改受伤后的血量
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" + "造成了" +
                hurt + "点伤害," + role.getName() + "还剩下" + remainBlood + "滴血");



    }
}
