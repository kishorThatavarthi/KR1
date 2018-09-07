import java.util.*;
class Player8
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String[] arr=str.split(" ");
  for(int i=0;i<arr.length;i++)
  {
   String str1=arr[i];
   for(int j=0;j<str1.length();j++)
   {
     char ch=str1.charAt(j);
     if(j==0)
     {
       System.out.print(Character.toUpperCase(ch));
      }
    else
    {
      System.out.print(ch);
     }
   }
   System.out.print(" ");
  }
 }
}
      
