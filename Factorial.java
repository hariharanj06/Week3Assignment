package week3.day5.assignment;

public class Factorial {
public static void main(String[] args) {
	//Declare the variable fact as 1
	int fact =1;
	//Iterate the for loop
	for (int i = 1; i <= 5; i++) {
		//fact stores as multiplication of fact AND i
		fact = fact * i;
	}
	//print fact
	System.out.println(fact);
}
}
