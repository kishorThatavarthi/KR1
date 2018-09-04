/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringDigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				System.out.print(ch);
			}
		}
	}
}
