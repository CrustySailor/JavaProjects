package Methods1;

public class Question2_1_3 {

    public static double calcPeri(double length, double width) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public static void main(String[] args) {
        // Example usage
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = calcPeri(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }
}
