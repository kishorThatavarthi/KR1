import java.util.*;
class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner input=new Scanner(System.in);
  int number=input.nextInt();;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 }  
}  
