package practise;

import java.util.Scanner;

public class PassOrFailMarks{
    
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        int marks;
        
        System.out.println( "Enter your marks: " );
        marks =sc.nextInt();
        
        if ( marks < 35 ){
        	
            System.out.println( "You've Failed :(" );
            
        } else if ( marks >= 35 && marks <= 60 ){
        	
            System.out.println("You've Passed");
            
        } else if ( marks > 60 && marks <= 75 ){
        	
            System.out.println("You have First Class");
            
        } else if ( marks > 75 ){
        	
            System.out.println("You have Distinction");
            
        }
        
        sc.close();				// Important to close this, if dont want to loose marks
        
    }
    
}