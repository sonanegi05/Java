import java.util.*;

public class Input {
	public static void main(String a[]) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the name: ");
		String name = sc.nextLine();
        
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
		
		System.out.println("NAME: " + name + "\nAGE: " + age);
	}
}