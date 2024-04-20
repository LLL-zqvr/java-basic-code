package com.itheima.test4;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    //空参构造函数
    public User(){}
    //全参构造函数
    public User(String username, String password, String email, String gender, int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //set和get
    //此外，可以通过快捷键alt + insert来进行快速构造
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}
