import java.util.*;
class AvgOfElements
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
  int sum=0;
  for(int i=0;i<a.length;i++)
  {
   sum=sum+a[i];
    }
   int avg=sum/n;
  System.out.print(avg);
  }
 }
