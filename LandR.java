import java.util.*;
class LandR
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int c=s.nextInt();
  boolean f=false;
  for(int i=b+1;i<c;i++)
  {
   if(i==a)
    {
     b=true;
     break;
     }
   }
  if(f)
   System.out.print("yes");
  else
    System.out.print("no");
   }
 }
