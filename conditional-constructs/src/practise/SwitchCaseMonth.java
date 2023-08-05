package practise;

import java.util.Scanner;

public class SwitchCaseMonth {
	
	public static void main(String[] args) {
		
	    int monthNum;
	    Scanner sc = new Scanner( System.in );
	    
	    for (int i = 0; i<=12; i++) {
	    	
	        System.out.println("enter the month number ");
	        monthNum = sc.nextInt();
	        
	        switch (monthNum) {
	        
	            case 1:
	                System.out.println( "January" );
	                break;
	            case 2: 
	                System.out.println( "February" );
	                break;
	            case 3:
	                System.out.println( "March" );
	                break;
	            case 4: 
	                System.out.println( "April" );
	                break;
	            case 5: 
	                System.out.println( "May" );
	                break;
	            case 6: 
	                System.out.println( "June" );
	                break;
	            case 7: 
	                System.out.println( "July" );
	                break;
	            case 8: 
	                System.out.println( "August" );
	                break;
	            case 9: 
	                System.out.println( "September" );
	                break;
	            case 10: 
	                System.out.println( "October" );
	                break;
	            case 11: 
	                System.out.println( "November" );
	                break;
	            case 12: 
	                System.out.println( "December" );
	                break;
	            default:
	                System.out.println( "Couldn't understand what you entered!" );
	                System.out.println( "Exiting" );
	    	        sc.close();
	                System.exit(0);
		    }
	        
		}
	    
        sc.close();
	}
}