package Arrays;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int [] studMarks = new int[5];
        double avrage = 0;
        int maxIndex = 0 , maxNum = 0 , sum = 0 , temp = 0;

            for (int i = 0 ; i <= 4 ; i++) {

                System.out.print("Please enter marks for student" + (i + 1) + " : ");
                temp = scan.nextInt();

                    if (temp > 100 || temp < 0) { //Error cheking

                        System.out.println("You have entered an invalid mark , please reenter the mark .");
                        i--;
                    } else {
                        studMarks[i] = temp;
                    }
            }
            
            for (int i = 0 ; i <= 4; i++ ) {

                System.out.println("Student" + (i + 1) + " : " + studMarks[i]);
                sum += studMarks[i];

            }

            for (int i = 0 ; i <= 4 ; i++){

                if (studMarks[i] > maxNum){
                    maxNum = studMarks[i];
                    maxIndex = i;
                }

                studMarks[i] = studMarks[i] + 5;
            }
            avrage = sum/studMarks.length;

        System.out.println("\nThe class avrage is : " + avrage );
        System.out.println("The best mark is : " + maxNum + " and is student" + (maxIndex +1));
        System.out.println("The adjusted marks are : " + "\n"); 

            for (int i = 0 ; i <= 4; i++ ) {

                System.out.println("Student" + (i + 1) + " : " + studMarks[i]);

            }
        scan.close();
    }
}
