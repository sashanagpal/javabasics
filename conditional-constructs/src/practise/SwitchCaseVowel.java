package practise;

import java.util.Scanner;

public class SwitchCaseVowel {

    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabet: ");
        
        String vowel = sc.nextLine(); 
        
        // vowel = vowel.toLowerCase();					// Can also conver to lower case here first
        
        switch ( vowel.toLowerCase() ){
        
            case "a":
                System.out.println("'a', is a vowel");
                break;
                
            case "e":
                System.out.println("'e', is a vowel");
                break;
                
            case "i":
                System.out.println("'i', is a vowel");
                break;
                
            case "o":
                System.out.println("'o', is a vowel");
                break;
                
            case "u":
                System.out.println("'u', is a vowel");
                break;
                
            default:
                System.out.println("'" + vowel + "' is a consonant");
                
        }
        
        sc.close();
    }	
}
