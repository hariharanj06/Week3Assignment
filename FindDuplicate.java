package week3.day5.assignment;

import java.util.Arrays;

public class FindDuplicate {
public static void main(String[] args) {
	//Declare a value tp store
	int[] num = {1,2,4,6,2,4};
	//for arrange as ascending order
	Arrays.sort(num);
	//Declare Increment for loop condition in two ways 
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			//enter if condition to found duplicte
			if(num[i]==num[j]) {
				System.out.println(num[i]);
			}
			
		}
		
	}
}
}
