/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LCM {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);

        int n1 = s.nextInt(), n2 = s.nextInt(), lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.print(lcm);
                break;
            }
            ++lcm;
        }
    }
}
