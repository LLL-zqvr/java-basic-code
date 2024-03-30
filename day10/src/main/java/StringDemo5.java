import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //统计字符
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        int sumBig = 0;//大写字符
        int sumSmall = 0;//小写字符
        int sumNumber = 0;//数字字符
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                sumSmall++;
            } else if (c >= 'A' && c <= 'Z') {
                sumBig++;
            } else if (c >= '0' && c <= '9') {
                sumNumber++;
            }
        }
        System.out.println("大写字符有" + sumBig + "个");
        System.out.println("小写字符有" + sumSmall + "个");
        System.out.println("数字字符有" + sumNumber + "个");

    }
}
