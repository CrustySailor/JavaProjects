package Methods1;

import java.util.Scanner;

public class MethodsTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Num1 =0 , Num2 =0 ;

        System.out.println("Enter Number 1 : ");
            Num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
            Num2 = sc.nextInt();

        System.out.println("The sum of Num1 and Num2 is : " + Add(Num1 , Num2));
    }
    public static int Add(int Num1 , int Num2){
        return(Num1 + Num2);
    }
}