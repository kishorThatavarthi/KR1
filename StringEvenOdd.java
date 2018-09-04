/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
	    String str1="",str2="";
	    for(int i=0;i<str.length();i++)
	    {
	    	 if(i%2==0)
	    	 {
	    	 	str1=str1+str.charAt(i);
	    	 }
	    	 else
	    	 {
	    	 	str2=str2+str.charAt(i);
	    	 }
	    }
	    System.out.print(str1+" "+str2);
	}
}
