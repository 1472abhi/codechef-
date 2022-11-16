/* In the current semester, you have taken XXX RTP courses, YYY Audit courses and ZZZ Non-RTP courses.

The credit distribution for the courses are:

    444 credits for clearing each RTP course.
    222 credits for clearing each Audit course.
    No credits for clearing a Non-RTP course.

Assuming that you cleared all your courses, report the number of credits you obtain this semester. */

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
	        int z=sc.nextInt();
	        System.out.println((4*x)+(2*y)+(0*z));
	    }
		// your code goes here
	}
}
