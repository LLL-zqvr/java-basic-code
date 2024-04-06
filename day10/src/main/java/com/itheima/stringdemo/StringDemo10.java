package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //替换敏感词
        //1.获取到说的话
        String talk = "你玩得真好，以后不要再玩了，TMD,CNM" ;
        //2.定义一个敏感词库
        String[] arr = {"CNM","NTM","TMD","MLGB","SB"};
        //3.把里面的敏感词换成***
        for(int i = 0; i < arr.length; i++){
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
