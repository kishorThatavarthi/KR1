import java.util.*;
class NumbersSum
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int count=0,sum=0,rem=0;
 while(n>0)
{
 rem=n%10;
 sum=sum+rem;
 n=n/10;
 
 }
 System.out.print(sum);
 
 }
}
