package practise;

import java.util.Scanner;

public class NumberSplitterTwo {

	public static void main(String[] args) {
		
		String numberToSplit;
		long ctr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		numberToSplit = sc.next();
		
		for (int i = 0; i < numberToSplit.length() - 1; i++ ) {

			System.out.println( numberToSplit.charAt( i ) );
		}
		
	}

}
