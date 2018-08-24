import java.util.*;
class NumberInOrNot
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int count=0;
 for(int i=1;i<=10;i++)
 {
   if(i==n)
   {
     count=1;
    }
 }
 if(count==1)
  System.out.print("yes");
 else
   System.out.print("no");
 }
}
