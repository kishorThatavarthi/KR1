/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Middle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(str.length()%2==0)
		{
	              for(int i=0;i<str.length();i++)
	              {
	              	char ch=str.charAt(i);
	              	if(i==str.length()/2-1 ||i==str.length()/2)
	              	{
	              		System.out.print("*");
	              	}
	              	else
	              	{
	              		System.out.print(ch);
	              	}
	              }
		}
	          else
	          {
	          	for(int i=0;i<str.length();i++)
	          	{
	             	char ch=str.charAt(i);
	              	if(i==str.length()/2)
	              	{
	              		System.out.print("*");
	              	}
	              	else
	              	{
	              		System.out.print(ch);
	              	}
	          }
	          }
	}
}
