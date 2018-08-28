import java.util.*;
class AddEvenOdd
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int a=s.nextInt();
  int c=n+a;
  if(c%2==0)
   System.out.print("even");
  else
    System.out.print("odd");
  }
}
