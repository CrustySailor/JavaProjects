package Methods1;

import java.util.Scanner;
import static java.lang.Math.*;

public class CylinderShape {

    public static double calcArea(double raduis , double hieght){
        return((2*PI*(pow(raduis , 2) * hieght) + 2*PI*(pow(raduis , 2))));
    }

    public static double calcVolume(double raduis , double hieght){
        return(PI*(pow(raduis, 2) * hieght));
    }

    public static void displayValues(double hieght ,double base ,double volume ,double area){

        if (volume == 0.0){
            System.out.println("The height is : " + hieght +" The base is : " + base + " The area is : " + area );
        } else if (area == 0.0){
            System.out.println("The height is : " + hieght +" The base is : " + base + " The volume is : " + volume );
        }
    }
    public static void main(String[] args){

        double baseA = 0.0 , heightA = 0.0;
        double volume = 0.0 , area =0.0;
        char calcType ;
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the hight : ");
            heightA = sc.nextDouble();
            System.out.print("Enter the base : ");
            baseA = sc.nextDouble();
                
            do {

                System.out.print("Wich calculation do you want to do ? |(V)olume|(A)rea|(N)on| ");
                calcType = sc.next().charAt(0);
                calcType = Character.toUpperCase(calcType);

                switch (calcType){
                    
                    case 'V':
                        volume = calcVolume(baseA, heightA);
                        displayValues(heightA, baseA, volume, area);
                    break;

                    case 'A':
                        area = calcArea(baseA, heightA);
                        displayValues(heightA, baseA, volume, area);
                    break;

                    case 'N':
                        System.out.println("Goodbye");
                    break;

                    default :
                        System.out.println("You entered an invalid option pleas choose again");
                    break;

                }

            }while(calcType != 'N');

        sc.close();
    }
}
