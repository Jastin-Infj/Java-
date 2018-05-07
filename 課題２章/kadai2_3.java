import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class kadai2_3
{
    public static void main(String[] a)
    {
       boolean bo = 3 < 4;
       byte by = 127;
       int in = 0xFFFFFFF;
       System.out.println(!bo);//反対を返す 3 > 4 false
       System.out.println(++by);//127がMAXなので-128が返す
       System.out.println(in);//int型の最大個数
       System.out.printf("%X\n",in << 8);
       System.out.printf("%X\n",in >>> 8);
       System.out.println(in >>>8);
       System.out.println(~in);//反対を返す
    }
}
