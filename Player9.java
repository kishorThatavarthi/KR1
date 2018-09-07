import java.util.*;
class Player9
{
 public static void main(String[] arg)
 {
  Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();
  int r=sc.nextInt();
  int count=0;
  int sum=0;
  for(int i=l;i<=r;i++)
  {
   int j=i;
   for(int k=1;k<=j;k++)
   {
    if(j%k==0)
    {
      count++;
     }
   }
   if(count==2)
   {
     sum++;
    }
   count=0;
  }
   System.out.print(sum);
 }
}  
