package practise;

import java.util.Scanner;

public class NumberSplitter {

	public static void main(String[] args) {
		
		String numberToSplit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		numberToSplit = sc.next();
		
		char[] splits = numberToSplit.toCharArray(); 

		System.out.println( splits[0] );
		System.out.println( splits[1] );
		System.out.println( splits[2] );
		
//		for (int i = 0; i < splits.length; i++)
//			System.out.println(splits[i]);

	}

}
