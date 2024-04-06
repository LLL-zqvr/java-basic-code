package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方法
        String name = "abc";
        System.out.println(name);
        //2.创建空白字符串，不含任何内容
        String s1 = new String();
        System.out.println("a" + s1 + "b");
        //全参构造，多此一举，不值得用
        String s2 = new String("dog");
        System.out.println(s2);
        //根据字符数组创建新的字符串对象
        char[] arr1 = {'h','e','l','l','o'};
        String s3 = new String(arr1);
        System.out.println(s3);
        //根据字节数组创建新的字符串对象(利用ASCII码表)
        //网络的数据都是通过字节来传输，这时便需要该类进行编码
        byte[] bytes = {97,98,99,100};
        String s4 = new String(bytes);
        System.out.println(s4);


    }
}
