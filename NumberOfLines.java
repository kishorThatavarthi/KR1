import java.util.*;
class NumberOfLines
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  int count=0;
  for(int i=0;i<str.length();i++)
  {
   char ch=str.charAt(i);
   if(ch=='.')
   {
    count++;
    }
   }
   System.out.println(count);
  }
 }
