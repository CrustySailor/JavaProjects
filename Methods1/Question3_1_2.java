package Methods1;

import java.util.Random;

public class Question3_1_2 {
    public static int findHighest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findLowest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void display(int highest, int lowest) {
        System.out.println("The highest value is: " + highest);
        System.out.println("The lowest value is: " + lowest);
    }

    public static void main(String[] args) {
        Random random = new Random();
        
        int value1 = random.nextInt(350) + 1;
        int value2 = random.nextInt(350) + 1;
        int value3 = random.nextInt(350) + 1;

        System.out.println("Generated values: " + value1 + ", " + value2 + ", " + value3);

        int highestValue = findHighest(value1, value2, value3);
        int lowestValue = findLowest(value1, value2, value3);

        display(highestValue, lowestValue);
    }
}
