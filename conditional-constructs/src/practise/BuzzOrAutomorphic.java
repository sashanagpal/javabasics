package practise;

import java.util.Scanner;

public class BuzzOrAutomorphic {

	public static void main(String[] args) {
		
		String numberToCheck;
		long numberToCheckAsLong = 0;
		String squaredNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number to check: ");
		numberToCheck = sc.next();
		
		numberToCheckAsLong = Long.parseLong( numberToCheck );
		
		// Lets check if its a Buzz Number - divisible by 7 OR ends with 7
		if ( numberToCheck.trim().endsWith("7") || (numberToCheckAsLong % 7 == 0)) {
			System.out.println("Its a Buzz Number!");
		} else {
			System.out.println("Its NOT a Buzz Number!");
		}
		
		// Lets check if its a Automorphic NUmber i.e. the square of a number has the same number as its last digits
		squaredNumber = String.valueOf( numberToCheckAsLong * numberToCheckAsLong ); 
		if (squaredNumber.endsWith(numberToCheck)) {
			System.out.println("Its a AutoMorphic Number!");
		} else {
			System.out.println("Its NOT a AutoMorphic Number!");
		}
	}

}
