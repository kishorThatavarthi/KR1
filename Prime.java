import java.util.*;
class Prime
{
  public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 boolean b=true;
 if(a==0||a==1)
  System.out.print("no");
 else if(a==2)
  System.out.print("yes");
 else
 {
 for(int i=2;i<a;i++)
 {
  if(a%i==0)
  {
   b=false;
   break;
   }
  }
 if(b)
  System.out.print("yes");
 else
   System.out.print("no");
  }
 }
}
