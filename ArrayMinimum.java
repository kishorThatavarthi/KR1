import java.util.Arrays;
import java.util.*;
class ArrayMinimum
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int a[]=new int[n];
  for(int i=0;i<a.length;i++)
  {
    a[i]=s.nextInt();
   }
  Arrays.sort(a);
  System.out.print(a[0]);
  }
}
