import java.util.*;
class MulDigits
{
 public static void main(String[] ags)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int rev=1;
  while(a>0)
  {
   int rem=n%10;
   rev=rev*rem;
   a=a/10;
   }
  System.out.print(rev);
  }
 }
   
