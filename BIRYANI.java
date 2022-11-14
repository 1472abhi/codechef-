/* Problem

According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for XXX weeks, and the cost of classes per week is YYY coins. What is the total amount of money that Chef will have to pay?*/

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
	        System.out.println(x*y);
	    }
		// your code goes here
	}
}
