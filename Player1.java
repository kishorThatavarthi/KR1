import java.util.*;
class Player1
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  StringBuffer sb=new StringBuffer(str);
  System.out.print(sb.reverse());
  }
}
