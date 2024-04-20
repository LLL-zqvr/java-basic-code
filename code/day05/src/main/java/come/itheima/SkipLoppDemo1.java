package come.itheima;

public class SkipLoppDemo1 {
    //continue的应用——跳过本次循环，继续执行下次循环。
    //小老虎吃包子，一共有五个包子,第三个包子有虫子
   public static void main(String[] args){
       for(int i = 1; i <= 5; i++){
          if(i == 3){
              continue;
          }
           System.out.println("小老虎在吃第" + i + "个包子");
       }
   }
}
