package week3.day5.assignment;

public class palindrome {
public static void main(String[] args) {
	//enter a string variable
	String name = "amma";
	//Enter empty variable in string
	String rev = "";
	//Declare chararray condition to seperate letters
	char[] charArray = name.toCharArray();
	//Enter for loop condition of increment
	for (int i = charArray.length-1; i >= 0 ; i--) {
		//Store the condition rev variable to reverse
		rev = rev + charArray[i];
		
	}
	System.out.println(rev);
	//Enter if condition to check condition equals
	if(name.equals(rev)) {
	System.out.println("is palindrome");
	}
	else {
		System.out.println("not palindrome");
	 
}
}
}
