package Methods1;

import java.util.Scanner;

public class Question4_3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double Salary =0.0 , salMonth = 0.0;

        System.out.print("Enter your Annual salary : ");
            Salary = sc.nextDouble();
        
            salMonth = calcMonthly(Salary);
        displaySalary(salMonth);
    }
    public static double calcMonthly(double AnnualSal){
        return(AnnualSal / 12);
    }
    public static void displaySalary(double MonthlySal){
        System.out.println("Your monthly salary is : " + MonthlySal);
    }
}
