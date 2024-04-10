package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

    loop:    while (true) {
            System.out.println("--------------欢迎来到yumu学生管理系统-------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch(choose){
                case "1":
                    System.out.println("1:添加学生");
                    break;
                case "2":
                    System.out.println("2:删除学生");
                    break;
                case "3":
                    System.out.println("3:修改学生");
                    break;
                case "4":
                    System.out.println("4:查询学生");
                    break;
                case "5":
                    System.out.println("5:退出");
                    //break loop;
                    System.exit(0);//停止虚拟机的运行
                default:
                    System.out.println("没有这个选项");
                    break;

            }

        }


    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学生的id");
        String id = sc.next();
        student.setId(id);
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        student.setName(name);
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("请输入学生的地址");
        String address = sc.next();
        student.setAddress(address);
        list.add(student);
        System.out.println("学生添加成功");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待删除学生的姓名:");
        String name = sc.next();
        int flag = 0;
        for(int i = 0; i < list.size(); i++){
            if(name.equals(list.get(i).getName())){
                Student remove = list.remove(i);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("没有查询到该学生，删除失败");
        }
    }
    //修改学生
    public static void changeStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);

    }
    //查询学生
}
