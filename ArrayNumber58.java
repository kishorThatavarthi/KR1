import java.util.*;
class ArrayNumber58
{
 public static void main(String[] args)
{
  boolen b=false;
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
    b=true;
   }
 }
  if(b)
    System.out.print("yes");
  else
    System.out.print("no");
 }
}
