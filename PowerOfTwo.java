import java.util.*;
class PowerOfTwo
{
    
    static boolean isPowerOfTwo (int x)
    {
     
        return x!=0 && ((x&(x-1)) == 0);
         
    }
     
  
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         System.out.print(isPowerOfTwo(n) ? "yes" : "No");
         
         
    }
}
