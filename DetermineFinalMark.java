import java.util.Scanner;

public class DetermineFinalMark {

    public static void main(String[] args){

        Scanner Keyboard = new Scanner(System.in);
        double Mark1 = 0 , Mark2 = 0 , Mark3 = 0 , MarkAvg = 0 , MarkExam = 0 , MarkFinal = 0 ;

        for (int i = 1; i <= 21; i++) {
            System.out.print("Enter Mark 1 for student " + i);
                Mark1 = Keyboard.nextDouble();
            System.out.print("Enter Mark 2 for student " + i);    
                Mark2 = Keyboard.nextDouble();
            System.out.print("Enter Mark 3 for student " + i);    
                Mark3 = Keyboard.nextDouble();
            System.out.print("Enter Exam Mark for student " + i);    
                MarkExam = Keyboard.nextDouble();

            MarkAvg =( Mark1 + Mark2 + Mark3 ) / 3 ;
            MarkFinal = (MarkAvg /2) + (MarkExam / 2);

            System.out.println("The final mark for student " + i + " = " + MarkFinal);

        }
    }
}
