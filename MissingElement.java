package week3.day5.assignment;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	//Enter a variable
	int[] num = {1,3,4,2,6,5,8};
	//enter array condition to form ascending order
	Arrays.sort(num);
	
	//Enter a for loop increment condition 
	for (int i = 0; i < num.length; i++) {
		
		//enter if condition to satisfy output
		if(num[i]!=i+1) {
			
			System.out.println(i+1);
		}
		
	}
}
}
