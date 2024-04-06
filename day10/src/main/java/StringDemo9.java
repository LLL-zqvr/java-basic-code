import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //根据身份证得出人物信息
        //身份证的7-14位是出生年月日，第十七位是性别（奇数男，偶数女）
        Scanner sc = new Scanner(System.in);
        //请输入身份证号
        String number = sc.next();
        String year = number.substring(6,10);
        String month = number.substring(10,12);
        String day = number.substring(12,14);
        //获取性别
        char sex = number.charAt(16);
        //将字符转为数字
        int num = sex - 48;
        String gender;
        if(num % 2 == 0){
            gender = "女";
        }else {
            gender = "男";
        }
        System.out.println("出生年月日为：" + year + "." + month + "." + day + ".");
        System.out.println("性别为：" + gender);


    }
}
