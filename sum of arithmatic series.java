/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static float sumOfAP(int a, int d, 
                                  int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner input=new Scanner(System.in);
		 
		int n = input.nextInt();;
        int a = input.nextInt(), d = input.nextInt();
        System.out.println(sumOfAP(a, d, n));
	}
}
