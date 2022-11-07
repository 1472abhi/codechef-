/*Problem
There is a fair going on in Chefland. Chef wants to visit the fair along with his NN friends. Chef manages to collect KK passes for the fair. Will Chef be able to enter the fair with all his NN friends?

A person can enter the fair using one pass, and each pass can be used by only one person.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    if(n<k){
	        System.out.println("yes");
	    }else{
	        System.out.println("no");
	    }
	}
		// your code goes here
	}
}
