/* Problem

In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:

    Top 101010 participants receive rupees XXX each.
    Participants with rank 111111 to 100100100 (both inclusive) receive rupees YYY each.

Find the total prize money over all the contestants.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        System.out.println((10*x)+(90*y));
	    }
		// your code goes here
	}
}
