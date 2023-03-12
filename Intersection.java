package week3.day5.assignment;

public class Intersection {
public static void main(String[] args) {
	//Enter the variables as num1 and num2
	int[] num1 = {10,11,12,13,14,15};
	int[] num2 = {10,12,16,17,18,19};
	//Enter for loop increment condition in both ways as i & j
	for (int i = 0; i < num1.length; i++) {
		for (int j = 0; j < num2.length; j++) {
			//Enter if condition to get an accurate output
			if(num1[i]==num2[j]) {
				System.out.println(num1[i]);
			}
		}
	}
}
}
