import java.util.*;
class Player43
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 String str=s.next();
 String str1=s.next();
 boolean b=false;
 for(int i=0;i<str.length();i++)
 {
  if(str.substring(i).equals(str1))
    b=true;
  }
 if(b)
   System.out.print("yes");
 else
   System.out.print("no");
}
}
 
