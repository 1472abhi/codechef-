/* Problem
Alice and Bob are very good friends and they always distribute all the eatables equally among themselves.

Alice has AA chocolates and Bob has BB chocolates. Determine whether Alice and Bob can distribute all the chocolates equally among themselves.

Note that:

It is not allowed to break a chocolate into more than one piece.
No chocolate shall be left in the distribution. */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner sc=new Scanner(System.in);
	int T =sc.nextInt();
	while(T-->0){
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    if((A+B)%2==0){
	        System.out.println("yes");
	        
	    }else{
	        System.out.println("no");
	    }
	}
		// your code goes here
	}
}
