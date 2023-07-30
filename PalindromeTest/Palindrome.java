package PalindromeTest;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {

        int A =0 ,B = 0 ,C = 0 ,D = 0;
        Scanner Keyboard = new Scanner(System.in);

        do{
        System.out.println("Enter a 3 digit number.");
        A = Keyboard.nextInt();
        D = A;
        B = String.valueOf(A).length();

            if (B > 3) {
                System.out.println("Please enter a 3 digit number only");
            }
        }while(B > 3);   
        
        
        while (A > 0) {
            C = C * 10 + A % 10 ;
            A = A / 10; 
        }

        if (C == D){
            System.out.println("The Number is an palindrome.");

        } else {
            System.out.println("The Number is  NOT an palindrome.");

        }
    Keyboard.close();
    }
}