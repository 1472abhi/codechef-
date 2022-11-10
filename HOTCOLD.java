/* Problem
Chef considers the climate HOT if the temperature is above 2020, otherwise he considers it COLD. You are given the temperature CC, find whether the climate is HOT or COLD. */

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
	        int c=sc.nextInt();
	        if(c>20){
	            System.out.println("hot");
	        }else{
	            System.out.println("cold");
	        }
	    }
		// your code goes here
	}
}
