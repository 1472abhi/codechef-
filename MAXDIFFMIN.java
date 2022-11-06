/* 
 Problem
Chef is given 33 integers A, B,A,B, and CC such that A \lt B \lt CA<B<C.

Chef needs to find the value of max(A, B, C) - min(A, B, C)max(A,B,C)−min(A,B,C).

Here max(A, B, C)max(A,B,C) denotes the maximum value among A, B, CA,B,C while min(A, B, C)min(A,B,C) denotes the minimum value among A, B, CA,B,C.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner sc=new Scanner (System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int max=Math.max(a,Math.max(b,c));
	    int min=Math.min(a,Math.min(b,c));
	    
	    System.out.println(max-min);
	}
	
		// your code goes here
	}
}
