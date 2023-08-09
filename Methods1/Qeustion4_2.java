package Methods1;

import java.util.Scanner;

public class Qeustion4_2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Num1 =0, Num2 =0; 

        System.out.print("Enter your first number : ");
            Num1 = sc.nextInt();
        System.out.print("Enter your second number : ");
            Num2 = sc.nextInt();
        
    }
    public static boolean findEven(int A , int B){

        if ((A % 2 == 0) && (B % 2 ==0 )) {
            return true;
        } else {
            return false;
        }
    }
}
