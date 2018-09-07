import java.util.*;
class Player2
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int fact=1;
  int n=s.nextInt();
  if(n==0)
  {
    System.out.print(1);
  }
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
   }
  System.out.print(fact);
 }
}
  
