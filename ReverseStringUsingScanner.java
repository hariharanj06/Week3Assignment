package week3.day5.assignment;

import java.util.Scanner;

public class ReverseStringUsingScanner {
public static void main(String[] args) {

	//Declare scxanner condition to enter input
	Scanner scan = new Scanner(System.in);
	//print out to declare an input value as output
	System.out.println("Enter your Name");
	//Declare condition to print name in nextline
	String nextLine = scan.nextLine();
	//Declare condition to seperate the letters in the word
	char[] character = nextLine.toCharArray();
	//Enter the decrement for loop condition to scan the variable
	for (int i =  character.length-1; i >= 0;i--) {
	System.out.print(character[i]);
}
}}
