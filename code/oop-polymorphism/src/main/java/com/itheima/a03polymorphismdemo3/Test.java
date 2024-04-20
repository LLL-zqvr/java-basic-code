package com.itheima.a03polymorphismdemo3;

public class Test {

    public static void main(String[] args) {
        Animal a = new Dog();
        //eat方法是animal有的，所以编译通过且成功运行
        //调用方法时编译看左边，运行结果看右边
        a.eat();
        //多态的弊端
        //如a.lookHome;
        //不能调用子类的特有功能
        //************解决方案*****************
        //变回子类类型
        //因为父类范围更大，所以要强制转换
        Dog d = (Dog)a;
        //((Dog) a).lookHome();
        d.lookHome();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }

}
class Dog extends Animal{
    public void eat(){
        System.out.println("修狗在吃骨头");
    }
    public void lookHome(){
        System.out.println("修狗在看家，可爱捏");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("修猫在吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("修猫抓老鼠");
    }
}