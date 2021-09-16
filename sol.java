package qhrsols;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;
public class sol {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(questionOne());
		//System.out.println(questionTwo());
		
	}
	
	public static int digitSquareSum(int n) {
		int temp = n;
		int length = String.valueOf(temp).length();
		int counter = 1;
		int sum = 0;
		
		if(length == 1) {
			return (int) Math.pow(n, 2);
		}
		while (counter <= length) {
			if(counter == 1) {
				int digit = n / (int)(Math.pow(10, length - counter));
				sum += Math.pow(digit, 2);
			}else {
				 int digit = (int) ((n / (Math.pow(10, length - counter))) % 10);
				
				sum += Math.pow(digit, 2);
			}
			counter++;
		}
		return sum;
		
    }

   
        
    }
    
    
    
    
   


