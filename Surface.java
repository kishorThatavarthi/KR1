import java.util.*;
class Surface
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int l=s.nextInt();
  int b=s.nextInt();
  int h=s.nextInt();
  System.out.print(2*l*b+2*b*h+2*l*h);
  System.out.print(l*b*h);
  }
 }
