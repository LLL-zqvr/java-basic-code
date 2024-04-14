package com.itheima;

public class PullPermutation {
    //全排列问题
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        permutation(list, 0, 3);

    }

    public static void permutation(int[] list, int k, int m) {
        if (k == m) {
            for (int i = 0; i <= m; i++) {
                System.out.print(list[i] + " ");

            }
            System.out.println();
        } else {
            for (int i = k; i <= m; i++) {
                //交换list[k]和list[i]
                int temp = list[k];
                list[k] = list[i];
                list[i] = temp;
                permutation(list, k + 1, m);
                temp = list[k];
                list[k] = list[i];
                list[i] = temp;
            }
        }
    }
}