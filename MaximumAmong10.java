import java.util.*;
class MaximumAmong10
{
 public static void main(String[] args)
 {
  int a[]=new int[10];
  int max;
  Scanner s=new Scanner(System.in);
  for(int i=0;i<a.length;i++)
  {
   a[i]=s.nextInt();
   }
  max=a[0];
  for(int i=0;i<a.length;i++)
  {
   if(a[i]>max)
   {
     max=a[i];
     }
  }
  System.out.print(max);
 }
}
