/*Problem
Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?
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
	    int T= sc.nextInt();
	    for(int i=0;i<T;i++){
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        if(X < Y){
	            System.out.println("FIRST");
	            
	        }
	        else if(X > Y){
	            System.out.println("SECOND");
	            
	        }
	        else{
	            System.out.println("ANY");
	        }
	    }
	    
	}
}