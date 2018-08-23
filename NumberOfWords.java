import java.util.*;
class NumberOfWords
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  int count=1;
  for(int i=0;i<str.length();i++)
  {
   char ch=str.charAt(i);
   if(Character.isWhitespace(ch))
   {
    count++;
    }
   }
   System.out.println(count);
  }
 }
