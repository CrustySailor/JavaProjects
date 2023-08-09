package Methods1;

import java.util.Scanner;

public class Question1_1 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double OrPrice =0.0;

        System.out.print("Enter the origenal price of the dress : ");
            OrPrice = sc.nextDouble();

        System.out.println("The discounted price is : " + calculatePrice(OrPrice));
    sc.close();
    }

    public static double calculatePrice(double OrPrice){
        return(OrPrice * 0.75);
    }
}
