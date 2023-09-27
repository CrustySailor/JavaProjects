package StringsChar;

public class Numbers {
    
    public static void main (String[] args){
        
        String A = "jd awlem ae R60 asjwe aslk R40" ;
        int LengthOfStr = A.length();
        String NumA = "";
        int Total = 0;

        for (int I = 0 ; I < LengthOfStr ; I++){

            if (Character.isDigit(A.charAt(I))) {

                NumA = NumA + A.charAt(I); // Append the digit to NumA
            } else {

                if (!NumA.isEmpty()) {
                    Total = Total + Integer.parseInt(NumA);
                    NumA = ""; // Reset NumA for the next number
                }
            }
        }

        if (!NumA.isEmpty()) {
            Total = Total + Integer.parseInt(NumA);
        }

        System.out.println(Total);
    }
}
