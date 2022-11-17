/* Problem

Chef is fond of burgers and decided to make as many burgers as possible.

Chef has AAA patties and BBB buns. To make 111 burger, Chef needs 111 patty and 111 bun.
Find the maximum number of burgers that Chef can make. */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner (System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        if(a>b){
	            System.out.println(b);
	        }else{
	            System.out.println(a);
	        }
	    }
		// your code goes here
	}
}
