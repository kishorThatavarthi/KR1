import java.util.*;
class StringBinary
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.next();
  boolean b=false;
  for(int i=0;i<str.length();i++)
  {
    char ch=str.charAt(i);
    if(ch=='0'||ch=='1')
    {
      b=true;
    }
    else
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
