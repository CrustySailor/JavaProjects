package TutorialAssessment1;

import java.util.Scanner;

public class MaritalStatus {

    public static void main (String[] args) {

        Scanner Keybaord = new Scanner(System.in);
        String description;

        System.out.println("Enter your meritial status");
        char grade = Character.toLowerCase(Keybaord.next().charAt(0));

        switch(grade) {

            case 's' : 
                description = "Single";
            break;

            case 'm' :
                description = "Married";
            break;

            case 'd' :
                description = "Divorced";
            break;

            case 'c' : 
                description = "Civil Partnership";
            break;

            default :
                description = "Invalid Marital status";
            break;
        }
        System.out.println("Your marital satus is : " + description);

    }
}