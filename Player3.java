import java.util.*;
class Player3
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int fact=1;
  int n=s.nextInt();
  while(n>0)
  {
    int rem=n%10;
    System.out.print(rem);
    n=n/10;
   }
 }
}
  
