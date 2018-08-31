/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PerfectSquare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	            int m=s.nextInt();
	            int pr=n*m;
	            int sr=(int)Math.sqrt(pr);
	            if(sr*sr==pr)
	              System.out.print("yes");
	            else
	              System.out.print("no");
	}
}
