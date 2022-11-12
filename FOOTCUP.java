/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* It is the final day of La Liga. Chef has a certain criteria for assessing football matches.
In particular, he only likes a match if:

The match ends in a draw, and,
At least one goal has been scored by either team.
Given the goals scored by both the teams as XX and YY respectively, determine whether Chef will like the match or not.. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        if (x==y && x>0){
	            System.out.println("yes");
	        }else{
	            System.out.println("no");
	        }
	    }
		// your code goes here
	}
}
