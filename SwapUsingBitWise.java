import java.util.Scanner;
public class SwapUsingBitwise
{
    public static void main(String args[])
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.print(m+" "+n);
    }
}
