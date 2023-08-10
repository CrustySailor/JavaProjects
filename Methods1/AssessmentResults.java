package Methods1;

import java.util.Scanner;

public class AssessmentResults {

    public static String determineResults(int Percentage){
    //Determine pass or fail 

        if (Percentage >= 50){
            return("PASS");
        } else {
            return("FAIL");
        }
    }

    public static int calcPercentage(double testMarkB, int testTotalB){
    //calculate percentage 

        return ((int) Math.round((testMarkB / testTotalB) * 100));
    }

    public static boolean validateMarks(double testMarkA , int testTotalA){
    //validate user input
    return testTotalA > 0 && testTotalA <= 100 && testMarkA >= 0 && testMarkA <= testTotalA;
    }

    public static void displayValues(int percentageA, String ResultB){
    // display outcome

        System.out.println("Your percentage mark is : " + percentageA + "\nResult : " + ResultB);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter test total : ");
        int testTotal = sc.nextInt();
        System.out.print("Enter test mark here : ");
        double testMark = sc.nextDouble();

        //if valid or not
        if (validateMarks(testMark, testTotal) == true){

            String Result = determineResults(calcPercentage(testMark, testTotal));
            int ipercentage = calcPercentage(testMark, testTotal);
            displayValues(ipercentage, Result);

        }
        sc.close();
    }
}
