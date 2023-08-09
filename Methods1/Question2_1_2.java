package Methods1;

public class Question2_1_2 {
    
public static boolean getResults(double summative1, double summative2) {
        if (summative1 >= 50 || summative2 >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Summative 1 mark: ");
        double summative1Mark = scanner.nextDouble();

        System.out.print("Enter Summative 2 mark: ");
        double summative2Mark = scanner.nextDouble();

        if (getResults(summative1Mark, summative2Mark)) {
            System.out.println("The student has passed the module.");
        } else {
            System.out.println("The student has not passed the module.");
        }

        scanner.close();
    }
}
