import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n=123,rem=0,count=0;
		while(n>0)
		{
			rem=n%10;
			count++;
			n=n/10;
 
		}
		System.out.println(count);
	}
}
