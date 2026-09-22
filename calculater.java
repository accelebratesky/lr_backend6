import java.util.Scanner;


public class calculater {
       public int add(int a, int b){
              return a + b;
       }
       public int cut(int a, int b){
              return a - b;
       }
       public int chu(int a, int b){
            if(b == 0){
                   System.out.println("除数为0??!!!!");
                   return 0;
              }
              return a / b;
       }
       public int cheng(int a, int b){
              return a * b;
       }
       public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               System.out.println("give me 数字1：");
                int a = sc.nextInt();
                System.out.println("give me 数字2：");
                int b = sc.nextInt();
                System.out.println("give me 运算符：");
                String operator = sc.next();
                switch(operator){
                    case"+":
                        int result1 = new calculater().add(a, b);
                        System.out.println("为：" + result1);
                        break;
                    case"-":
                        int result2 = new calculater().cut(a, b);
                        System.out.println("为：" + result2);
                        break;
                    case"*":
                        int result3 = new calculater().cheng(a, b);
                        System.out.println("为：" + result3);
                        break;
                    case"/":
                        int result4 = new calculater().chu(a, b);
                        System.out.println("为：" + result4 );
                        break;
                }
                
        /* ai写的好，我写的瓜，笑死我了，感觉脑袋晕晕的
        Calculater cal = new Calculater();
        int result = 0; 

        switch(operator){
            case "+":
                result = cal.add(a, b);
                System.out.println("为: " + result);
                break;
            case "-":
                result = cal.cut(a, b);
                System.out.println("为: " + result);
                break;
            case "*":
                result = cal.cheng(a, b);
                System.out.println("为: " + result);
                break;
            case "/":
                result = cal.chu(a, b);
                System.out.println("为: " + result);
                break;
            default:
                System.out.println("运算符输入错误！");
                break;
        }*/
        sc.close();
    }
}

