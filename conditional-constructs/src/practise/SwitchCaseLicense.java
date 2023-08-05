package practise;

import java.util.Scanner;

public class SwitchCaseLicense {
	
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int age;
        
        System.out.println("enter your age: ");
        age = sc.nextInt();
        
        switch ( age ) {
        
            case 16: 
                System.out.println("You cannot apply");
                break;
                
            case 65: 
                System.out.println("You are a senior citizen, please do not drive");
                break;
                
            case 30: 
                System.out.println("You can apply");
                break;
                
            default:
                System.out.println("Didn't understand your input!");
        }
    }
    
}
