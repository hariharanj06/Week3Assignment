package week3.day5.assignment;

public class ChatOddUpper {
public static void main(String[] args) {
	//Declare a string variable
	
	String text = "oddupper";
	
	//enter chararray condition to seperate words
	
	char[] chararray = text.toCharArray();
	
	//enter increment for loop to move condition 
	
	for (int i = 0; i < chararray.length; i++) {
	
		//Declare if class for apply rules to print out
		if(i%2!=0){
			//Enter condition to uppercase
			char change = Character.toUpperCase(chararray[i]);
			System.out.print(change);
		}
		else {
			System.out.print(chararray[i]);
		}
	}
	
}
}
