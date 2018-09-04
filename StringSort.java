/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		for(char ch:arr)
		{
			System.out.print(ch);
		}
	}
}
