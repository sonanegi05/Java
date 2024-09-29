import java.util.Scanner;

public class DigitSeperationTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         * n = 1902
         * 
         * STEP 1:
         * digit = 2
         * n = 190
         * 
         * STEP 2:
         * digit = 0
         * n = 19
         * 
         * STEP 3:
         * digit = 9
         * n = 1
         * 
         * STEP 4: 
         * digit = 1
         * n = 0
         */

        int sum = 0;
        int rev = 0;

        while(n!=0) {
            int digit = n%10;
            // System.out.println(digit); // 2 0 9 1
            
            // SUM: 12
            sum = sum + digit;

            // 0 + 2 = 2
            // 20 + 0 = 20
            // 200 + 9 = 209
            // 2090 + 1 = 2091
            rev = rev*10 + digit;

            n = n/10;
        }

        System.out.println("SUM OF DIGITS: " + sum);
        System.out.println("REVERSE OF NUMBER: " + rev);
        System.out.println("CODE ENDS");
    }
}
