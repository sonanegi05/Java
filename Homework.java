import java.util.*;
public class Homework {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt ();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("enter=1 for addition ; 42enter=2 for sub");
        int c ;
        int input = sc.nextInt();
        switch (input) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3: 
                c = a * b;
                break;
            case 4:
                c = a / b;
                break;
            default:
                c = 0;
                break; 
        }
        System.out.println(c);
        sc.close();
    }
}