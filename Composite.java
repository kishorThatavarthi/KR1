/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Composite
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean b=false;
		for(int i=3;i<n;i++)
		{
			if(n%i==0)
			{
				b=true;
				break;
			}
		}
		if(b)
		 System.out.print("yes");
		else
		 System.out.print("no");
	}
}
