import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		while(n>0)
		{
		 d=n%10;
		System.out.print(d);
		n=n/10;
		}
	}
}
