/*Problem
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.

Calculate Pooja's account balance after an attempted transaction.
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws Exception{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String[] in = bf.readLine().split(" ");
        float n = Float.parseFloat(in[0]);
        float f = Float.parseFloat(in[1]);
        
        if(n%5==0 && f>=n+0.5f)
        System.out.println(f-n-0.5f);
        
        else{
            System.out.println(f);
        }
        
    }
}

