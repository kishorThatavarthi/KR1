import java.util.*;
class ArrayNumberCount57
{
 public static void main(String[] args)
{
  int count=0;
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 int b=s.nextInt();
 int c[]=new int[a];
 for(int i=0;i<c.length;i++)
 {
   c[i]=s.nextInt();
  }
 for(int i=0;i<c.length;i++)
 {
  if(c[i]==b)
  {
    count++;
   }
 }
 System.out.print(count);
 }
}
 
