public class kadai3_1_1
{
    public static void main(String[] a)
    {
       int[] point = new int[]{80,75,82};
       int sum = 0;
       for(int i = 0;i < point.length;++i)
       {
           sum += point[i];
       }
       System.out.println("合計は" + sum + "点");
       Average(point,sum);
    }
    public static void Average(int[] value,int total)
    {
       int Len = value.length;
       int average =total / Len;
       System.out.println("平均は" + average + "点");
    }
}
