public class Armstrong
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0,n1=1,n2=100;
     
        for(int i = n1; i <= n2; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
