/* Problem
Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote 
increases the volume by 11 while pressing the volume down button decreases the volume by 11. Chef wants 
to change the volume from XX to YY. Find the minimum number of button presses required to do so. 
*/

//SOLUTION :-

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>y){
		        System.out.println(x-y);
		    }else{
		        System.out.println(y-x);
		    }
		}
	}
}
