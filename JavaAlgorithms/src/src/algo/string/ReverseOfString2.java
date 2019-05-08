package src.algo.string;
import java.util.Scanner;

public class ReverseOfString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		StringBuilder reverse = new StringBuilder();
		
		for (int i =input.length()-1;i>=0;i--) {
			reverse = reverse.append(input.charAt(i));
		}
		if (input.toUpperCase().equals(reverse.toString().toUpperCase())) {
			System.out.println("Its a palidrome !! :) ");
		}
		else 
			System.out.println("Oopsie!! Its not a palindrome");
		scanner.close();
	}

}