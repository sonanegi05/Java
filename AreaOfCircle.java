
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius=");
        double pi = 3.14;
        double  a = sc.nextDouble();
        double Perimeter = 2*pi*a ;
        System.out.println("Perimeter is = " + Perimeter);
        double Area = pi*a*a;
        System.out.println("Radius is = " + Area);
    }
    
}
