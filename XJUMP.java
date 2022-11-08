/*Problem
Chef is currently standing at stair 00 and he wants to reach stair numbered XX.

Chef can climb either YY steps or 11 step in one move.
Find the minimum number of moves required by him to reach exactly the stair numbered XX. 
*/

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
	        int ans=0;
	        int stair=0;
	        while(stair<x){
	            stair+=y;
	            if(stair>x){
	                stair-=y;
	                stair++;
	            }
	            ans++;
	            
	        }
	        System.out.println(ans);
	    }
		// your code goes here
	}
}
