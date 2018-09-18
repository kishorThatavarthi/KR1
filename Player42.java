import java.util.*;
class Player42
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] arr=new int[n];
  int[] arr1=new int[n];
  for(int i=0;i<n;i++)
  {
    int b=s.nextInt();
    arr[i]=b;
     arr1[i]=b;
  }
  Arrays.sort(arr1);
  if(Arrays.equals(arr,arr1))
    System.out.print("yes");
  else
    System.out.print("no");
  }
}
