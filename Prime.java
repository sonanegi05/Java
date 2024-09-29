import java.util.Scanner;

public class Prime {

    /**
     * @param n
     * @return whether the variable 'n' is Prime or not
     * true for Prime number
     * false for non-prime number
     */
    public static boolean prime(int n) {
        // type you code here...

        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }

        // System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("is Prime: " + prime(n));
        sc.close();
    }
}