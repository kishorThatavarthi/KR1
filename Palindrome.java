import java.util.*;
class Palindrome
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  StringBuffer sb=new StringBuffer(str);
  if(str.contentEquals(sb.reverse()))
 {
   System.out.print("yes");
 }
 else
{
 System.out.print("no");
 }
 }
}
 
