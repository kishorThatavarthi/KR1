/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Last
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		int count=0;
		for(int i=str.length()-1;i>0;i--)
		{
		  System.out.print(str.charAt(i));
		  count++;
		  if(count==n)
		  {
		   break;
		   }
		}
	}
}
