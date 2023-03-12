package week3.day5.assignment;

public class ReverseOddNumbers {
public static void main(String[] args) {
//Enter the variable value	
 String text = "My Dad is Hero"; 
	 //Declare the split condition to find the words
	 String[] splitString = text.split(" ");
	//Declare the for loop increment value 
	 for (int i = 0; i <splitString.length ; i++) {
		//Enter the if condition to soecify the output
		 if(i%2!=0) {
			//Print out empty with space
			 System.out.print(" ");
//to seperate the words to reverse the condition
			char charArray[] = splitString[i].toCharArray();
			
			//Enter the for loop decrement value
			for(int j=charArray.length-1;j>=0; j--){
				//print out
				System.out.print(charArray[j]);
			}
			System.out.print(" ");

			}

		else {
			System.out.print(splitString[i]);
		}
}
}}
