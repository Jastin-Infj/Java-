public class kadai2_1_5
{
    public static void main(String[] a)
    {
        int value[] = new int[3];
        for(int i = 0;i < 3;++i)
        {
            value[i] = i * 2;
        }
        boolean flag[] = new boolean[3];
       for(int i = 0 ; i < 3;++i)
       {
           if (i == 0)
               flag[i] = value[i] > 3 && value[i] < 10;
           if (i == 1)
               flag[i] = value[i] > 3 || value[i] < 10;
           if (i == 2)
               flag[i] = value[i] != 3;
           System.out.println(flag[i]);
       }
    }
}
