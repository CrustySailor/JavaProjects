package Semestertest;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args){
        //Create scanner object
        Scanner scan = new Scanner(System.in);
        //Variables
        String userInput;

        //Get user input 
        System.out.print("Please enter a string here : ");
            userInput = scan.nextLine();

        //Create and populate arry for storage 
        char[] storage = new char[userInput.length()];

        for (int i = 0 ; i < userInput.length() ; i++){
            //if 5th char populate arry[i] with * else populate arry[i] with userinput data 
            if ( (i+1) % 5 == 0 ){
                storage[i] = '*';
            }else {
                storage[i] = userInput.charAt(i);
            }
        }
        //Display length of string 
        System.out.println("length of string = " + storage.length);
        //Display moded string
        for (int i = 0 ; i < storage.length ; i++){

            System.out.print(Character.toUpperCase(storage[i]));
        }
    //Cloase scanner object
    scan.close(); 
    }
}
