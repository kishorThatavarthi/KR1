/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class GCD {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);

        int n1 = s.nextInt(), n2 = s.nextInt(), gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.print(gcd);
    }
}
