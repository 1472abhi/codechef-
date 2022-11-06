/* Chef is buying sweet things to prepare for Halloween!

The shop sells both chocolate and candy.

Each bar of chocolate has a tastiness of XX.
Each piece of candy has a tastiness of YY.
One packet of chocolate contains 22 bars, while one packet of candy contains 55 pieces.

Chef can only buy one packet of something sweet, and so has to make a decision: which one should he buy in order to maximize the total tastiness of his purchase?

Print Chocolate if the packet of chocolate is tastier, Candy if the packet of candy is tastier, and Either if they have the same tastiness.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0){
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        if(2*X==5*Y){
	            System.out.println("Either");
	        }else if(2*X>5*Y){
	            System.out.println("Chocolate");
	        }else{
	            System.out.println("Candy");
	        }
	    }
		// your code goes here
	}
}
