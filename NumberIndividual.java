import java.util.*;
class NumberIndividual
{
  public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  String str=Integer.toString(a);
  for(int i=0;i<str.length();i++)
  {
    char ch=str.charAt(i);
    System.out.print(ch+" ");
  }
 }
}
