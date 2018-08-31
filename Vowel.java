import java.util.*;
class Vowel
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.next();
  boolen b=false;
  for(int i=0;i<str.length();i++)
  {
   char ch=str.charAt(i);
   if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
   {
    b=true;
    break;
    }
  }
  if(b)
    System.out.print("yes");
  else
    System.out.print("no");
    }
  }
