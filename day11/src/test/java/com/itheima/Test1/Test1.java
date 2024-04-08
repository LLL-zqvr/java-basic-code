package com.itheima.Test1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("jhcs",23);
        Student s2 = new Student("dss",67);
        Student s3 = new Student("sdfs",78);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + "," +list.get(i).getAge());
        }
    }
}
