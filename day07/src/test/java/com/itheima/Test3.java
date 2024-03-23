package com.itheima;

public class Test3 {
    public static void main(String[] args){
        /*某商城四个季度的营业额如下：
        22，66，44
        77，33，88
        25，45，65
        11，66，99
        求每个季度的总营业额和全年的总营业额
         */
        int[][] yearArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int[] sum = new int[4];
        for(int i = 0; i <yearArr.length; i++){
            //新思想，可以直接把一整个数组赋值给另一个数组
            int[] quarterArr = yearArr[i];
            sum[i] = arrSum(quarterArr);
            System.out.println("第" + (i + 1) + "季度的销售额为：" + sum[i]);
        }
        int ans = 0;
        for(int i = 0; i <sum.length; i++){
            ans += sum[i];
        }
        System.out.println("总营业额为：" + ans);

    }
    public static int arrSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){

            sum += arr[i];
        }
        return  sum;
    }
}
