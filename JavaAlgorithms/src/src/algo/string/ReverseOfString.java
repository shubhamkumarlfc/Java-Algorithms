package src.algo.string;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String reverse = "";
		
		for (int i =input.length()-1;i>=0;i--) {
			reverse = reverse+ input.charAt(i);
		}
		if (input.toUpperCase().equals(reverse.toUpperCase())) {
			System.out.println("Its a palidrome !! :) ");
		}
		else 
			System.out.println("Oopsie!! Its not a palindrome");
	}

}
