package CT1Weight;
import java.util.Scanner;
public class WeightLossApp {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Double rMonth = 0.0 , rTotal = 0.0 ;
        int iAbove = 0;
        
        for (int i = 1 ; i <= 6 ; i++) {

            System.out.print("Enter your weight loss for month " + i +" : ");
                rMonth = scan.nextDouble();
                rTotal += rMonth;
            
                if (rMonth > 3.5) {
                    System.out.println("Your weight loss is above avrage this month");
                    iAbove++;
                }
        }

        System.out.println("Your total weight los for 6 months were : " + rTotal + " kg");
        System.out.println("In " + iAbove + " Month(s) you lost more than the avrage weight ");
        scan.close();
    }
}