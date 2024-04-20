package com.itheima.a03interfacedemo3;

public class Button extends View{


    public Button(String name) {
        super(name);
    }

    public Button() {
    }
    @Override
    public void click() {
        System.out.println(getName());
    }

}
