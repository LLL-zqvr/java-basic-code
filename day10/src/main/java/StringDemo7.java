import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //金额转换
        //要求：把金额数字转换成发票中的中文金额格式————X佰X拾X万X仟X佰X拾X元
        //如：2135变成：零佰零拾零万贰仟壹佰叁拾伍元
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额:");
        int money = sc.nextInt();
        String str = moneyTurn(money);
        System.out.println(str);
    }
    public static String moneyTurn(int money){
        String aStr = "佰拾万仟佰拾元";
        String bStr = "" + money;
        String cStr = "";
        for(int i = 0; i < bStr.length(); i++){
            char c = bStr.charAt(i);
            switch (c) {
                case ('0'):
                    cStr = cStr + "零";
                    break;
                case ('1'):
                    cStr = cStr + "壹";
                    break;
                case ('2'):
                    cStr = cStr + "贰";
                    break;
                case ('3'):
                    cStr = cStr + "叁";
                    break;
                case ('4'):
                    cStr = cStr + "肆";
                    break;
                case ('5'):
                    cStr = cStr + "伍";
                    break;
                case ('6'):
                    cStr = cStr + "陆";
                    break;
                case ('7'):
                    cStr = cStr + "柒";
                    break;
                case ('8'):
                    cStr = cStr + "捌";
                    break;
                case ('9'):
                    cStr = cStr + "玖";
                    break;
            }

        }
        System.out.println(cStr);
        String dStr = "";
        for(int i = 0; i < 7 - bStr.length(); i++){
            dStr = dStr + "零";
        }
        //dStr 代表的是输入的钱数转成中文并用中文补位
        dStr = dStr + cStr;
        String eStr = "";
        for(int i = 0; i < 7; i++){
            eStr = eStr + dStr.charAt(i);
            eStr = eStr + aStr.charAt(i);
        }
        return eStr;
    }
}
