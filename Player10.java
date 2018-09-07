import java.util.*;
class Player10
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  String str1=sc.next();
  char ch=str.charAt(0);
  int count=0;
  for(int i=0;i<str1.length();i++)
  {
   char ch1=str1.charAt(i);
   if(ch!=ch1)
   {
     count++;
   }
 }
 if(count==1)
  System.out.print("yes");
 else
  System.out.print("no");
 }
}
