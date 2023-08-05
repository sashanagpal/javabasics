package practise;

import java.util.Scanner;

public class MaxAndMinOf3nums{
	
    public static void main (String args[]){
    	
        Scanner sc = new Scanner( System.in );
        int num1, num2, num3;
        
        System.out.println( "Enter first num: " );
        num1 = sc.nextInt();
        
        System.out.println( "Enter second num: " );
        num2 = sc.nextInt();
        
        System.out.println( "Enter third num: " );
        num3 = sc.nextInt();
        
        int mmax = Math.max( num1, num2 );
        int actualMax = Math.max( mmax, num3 );
        System.out.println( "The max num is: " + actualMax );
        
        int mmin = Math.min( num1, num2 );
        int actualMin= Math.min( mmin, num3 );
        System.out.println( "The min num is: " + actualMin );
        
        System.out.println( "Program Ends" );
        
        sc.close();				// Important to close this, if dont want to loose marks
        
    }
}