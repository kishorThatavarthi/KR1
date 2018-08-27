 import java.util.*;
class StringAlNum56
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 String str=s.next();
 boolean a=false,b=false;
 for(int i=0;i<str.length();i++)
 {
   char ch=str.charAt(i);
   if(Character.isLetter(ch))
   {
      a=true;
    }
   if(Character.isDigit(ch))
  {
     b=true;
   }
 }
 if(a && b)
   System.out.print("Yes");
 else
   System.out.print("No");
 }
}
