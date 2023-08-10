package Methods1;

public class Question2_1_1 {
    
    public static String determineAngle(int degrees) {
        if (degrees == 90) {
            return "The angle is a right angle";
        } else {
            return "The angle is not a right angle";
        }
    }

    public static void main(String[] args) {
        int angle = 90; 

        String result = determineAngle(angle);
        System.out.println(result);
    }
}

