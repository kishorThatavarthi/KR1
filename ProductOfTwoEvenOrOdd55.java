 import java.util.*;
class ProductOfTwoEvenOrOdd55
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 int b=s.nextInt();
 int c=a*b;
 if(c%2==0)
  System.out.print("even");
 else
   System.out.print("odd");
 }
}
