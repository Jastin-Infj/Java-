import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class kadai2_5
{
    static float sintyou;
    static int taizyuu;
    private static double BMI()
    {
        double total = 0.0f;
        total = taizyuu / (sintyou / 100  * sintyou /100);
        return total;
    }
    public static void main(String[] a)
    {
        Scanner sc;
        sc = new Scanner(System.in);

        for (int s = 0; s < 2; ++s)
        {
            if (s == 0)
            {
                System.out.print("身長を入力:");
            }
            if (s == 1)
            {
                System.out.print("体重を入力:");
            }
            if (s == 0) {
                sintyou = sc.nextInt();                //キー入力待ち　－＞文字列を整数にする
            }
            if (s == 1)
            {
                taizyuu = sc.nextInt();                //キー入力待ち　－＞文字列を整数にする
            }
        }
        printResult(BMI());
    }
    public static  void printResult(double bmi)
    {
       if(bmi  < 18.5)
       {
           System.out.println("瘦せすぎ");
       }
       else if(bmi < 25)
       {
           System.out.println("普通");
       }
       else if(bmi < 30)
       {
           System.out.println("太り気味");
       }
       else if(bmi >= 30)
       {
           System.out.println("太りすぎ");
       }
    }
}
