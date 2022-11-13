// In olden days finding square roots seemed to be difficult but nowadays it can be easily done using in-built functions available across many languages .

//Assume that you happen to hear the above words and you want to give a try in finding the square root of any given integer using in-built functions. So here's your chance.
.

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner input = new Scanner(System.in);
    	int cases = input.nextInt();
    	for (int i = 0 ; i < cases; i++){
    	    int n = input.nextInt();
    	    
    	    System.out.println((int)Math.sqrt(n));
    	} 
	}
}

