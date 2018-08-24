import java.util.*;
class StringGreater
{
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 String str=s.next();
 String str1=s.next();
 int i=str.compareTo(str1);
 int j=str1.compareTo(str);
 if(i>0 && j<0)
  System.out.println(str);
 if(j>0 && i<0)
  System.out.println(str1);
 if(i==0)
  System.out.println(str1);
 }
}
