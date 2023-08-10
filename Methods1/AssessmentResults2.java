package Methods1;

import java.util.Scanner;

public class AssessmentResults2 {

    public static void displaySummary(int Amount , int Pass){
    //display summary

        System.out.println("There are " + (Amount-1) + " students results for this module \nThere are " + Pass + " students who passed this module \nThere are " + ((Amount-1)-Pass) +" students who failed the module" );
    }

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

        System.out.println("Your percentage mark is : " + percentageA + " %" + "\nResult : " + ResultB);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int testTotal = 80; 
        double testMark = 0.0;
        int i = 1 , p = 0 ;

        do{

            System.out.print("Enter test mark for student " + i + " : ");
            testMark = sc.nextDouble();

            //if valid or not
            if (validateMarks(testMark, testTotal) == true){

                String Result = determineResults(calcPercentage(testMark, testTotal));
                int ipercentage = calcPercentage(testMark, testTotal);

                if (Result.equals("PASS")){
                    p++;
                }

                displayValues(ipercentage, Result);
                i++;

            }else if (testMark != -1){
                System.out.println("Invalid test mark ");
            }

        }while(testMark != -1);

        displaySummary(i, p);
        sc.close();
    }
}

