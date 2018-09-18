import java.util.*;
class Player44
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 String str=s.next();
 int n=s.nextInt();
 for(int i=n;i<str.length();i++)
 {
  System.out.print(str.charAt(i));
  }
 int a=str.length()-n;
 for(int i=0;i<a;i++)
 {
  System.out.print(str.charAt(i));
  }
 }
}
