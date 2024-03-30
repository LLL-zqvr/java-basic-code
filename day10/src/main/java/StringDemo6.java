import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //字符串的拼接
        //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
        //调用此方法，并输出
        //如：
        //数组 int[]arr = {1,2,3};
        //执行方法后的输出为：[1,2,3].
        int[] arr = {2,4,6,8,4,6,3};
        String str = arrToString(arr);

        System.out.println(str);

    }
    public static String arrToString(int[] arr){
        //如果数组为空
        if(arr == null){
            return "";
        }
        //如果数组长度为零
        // int[] arr = new int[0];该种情况数组长度为零
        if(arr.length == 0){
            return "[]";
        }
        //如果数组有内容
        String result = "[";
        for(int i = 0; i <arr.length; i++){

            if (i != arr.length - 1) {
                result = result + arr[i] +",";
            }else{
                result = result + arr[i];
            }
        }
        result = result + "]";
        return result;

    }
}
