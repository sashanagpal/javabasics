package practise;

import java.util.Scanner;

class PositiveNegativeOrZero{
	
    public static void main (String args[]){
    	
        Scanner sc =new Scanner(System.in);
        int num;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();
        
        if ( num < 0 ){
        	
            System.out.println("Its a negative number");
            
        } else  if ( num > 0 ) {
        	
            System.out.println("its a positive number");
            
        } else {
            
        	System.out.println("its a zero");
        	
        }
        
        sc.close();
        
    }
}