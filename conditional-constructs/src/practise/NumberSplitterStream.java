package practise;

import java.util.Scanner;

public class NumberSplitterThree {

	public static void main(String[] args) {
		
		long numberToSplit;
		long ctr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		numberToSplit = sc.nextLong();
		
		while (numberToSplit > 0) {
			
			ctr = numberToSplit % 10;
			numberToSplit = numberToSplit / 10;
			
			System.out.println( ctr );
		}
	}

}
