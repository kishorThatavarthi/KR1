import java.util.*;
class MaxMin
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  int max=0,min=0;
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  max=a[0];
  for(int i=0;i<a.length;i++)
  {
   if(max<a[i])
   {
     max=a[i];
    }
  }
  min=a[0];
  for(int i=0;i<a.length;i++)
  {
   if(min>a[i])
   {
     min=a[i];
    }
  }
 System.out.print(max+" "+min);
 }
}
  

  
