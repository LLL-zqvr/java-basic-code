package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //拼接数组，将数组的内容拼成字符串并用[]框出
        //定义数组
        int[]arr = {1,2,3};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]);
            sb.append(",");
        }
        sb.append(arr[arr.length - 1]);
        sb.append("]");
        String str = sb.toString();
        System.out.println(str);
    }
}
