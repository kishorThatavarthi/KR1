/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddPlace
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	            String str=Integer.toString(n);
	            for(int i=1;i<str.length();i++)
	            {
	            	if(i%2==1)
	            	 System.out.print(str.charAt(i)+" ");
	            }
	}
}
