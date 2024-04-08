import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘键入一串字符串并打乱其中的内容
        System.out.println("请输入一串字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //将字符串转为字符数组
        char[] arr = str.toCharArray();
        //打乱顺序，将每一个字符都与随机索引交换
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            char p = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = p;
        }
        String newStr = new String(arr);
        System.out.println(newStr);
    }


}
