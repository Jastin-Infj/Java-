import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class kadai2_4
{
    static float sintyou;
    static int taizyuu;
    private static float BMI()
    {
        float total = 0;
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
        System.out.println(BMI());
    }
}
