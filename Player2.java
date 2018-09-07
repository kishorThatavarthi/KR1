import java.util.*;
class Player2
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int fact=1;
  int n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
   }
  System.out.print(fact);
 }
}
  
