package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveZeroToRight {

	public static void pushzerotoend(int[] num, int n) {
		//Initialize a variable count with a value equal to zero.
		int count = 0;
		//Traverse through the array and check each element whether it is equal to zero or not.
		for (int i = 0; i < num.length; i++) {
			if (num[i] !=0) {
		//If the element is not equal to zero, put the element at the count'th position of the array.
				num[count++] = num[i];
			}
		}
		for (int j = count; j < n; j++) {
			//fill the remaining positions of the array with 0.
			num[count++] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		int[] num = {4,0,3,0,1,5,2,0};
		pushzerotoend (num, num.length);
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+ "  ");
		}
	   
	 }
	}

			  
	 
	 
	 
		
	
	

						
                   			
						
					
                   		
		
					

	


