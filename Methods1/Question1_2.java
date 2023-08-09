package Methods1;

import java.util.Scanner;

public class Question1_2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int iPoeple =0;

        System.out.print("Enter the amount of tickets you want to buy : ");
            iPoeple = sc.nextInt();
        System.out.println("Your total price is : " + calculateTicketCost(iPoeple));
        
        sc.close();
    }
    public static int calculateTicketCost(int iPoeple){
        int Price = 0 ;
        
        if ( iPoeple < 5) {
            Price = 125 ;
        } else if (iPoeple > 4 && iPoeple < 25) {
            Price = 100;
        } else {
            Price = 90;
        }

        return(Price * iPoeple);
    }
}
