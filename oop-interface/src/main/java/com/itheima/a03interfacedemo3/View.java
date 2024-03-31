package com.itheima.a03interfacedemo3;

public abstract class View {
    //属性
    private String name;

    public View(String name) {
        this.name = name;
    }

    public View() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //能力
    //可以被点击
    public abstract void click();

}
