import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player14
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
                        String str=sc.next();
                        String str1="";
                        for(int i=0;i<str.length();i++)
                        {
                        	char ch=str.charAt(i);
                        	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                        	{
                        	}
                        	else
                        	{
                        		str1=str1+ch;
                        	}
                
                        }
                        StringBuffer sb=new StringBuffer(str1);
                        System.out.print(sb.reverse());
	
	}
}
