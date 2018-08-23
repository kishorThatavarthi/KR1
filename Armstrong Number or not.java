import java.util.*;
import java.io.*;
class ArmstrongExample{  
  public static void main(String[] args)  {  
    int c=0,a,temp;
    Scanner i=new Scanner(System.in);
    int n=i.nextInt();//It is the number to check armstrong  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");   
   }  
}  
