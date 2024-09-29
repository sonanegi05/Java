import java.util.Scanner;

public class Demon {
    String name;
    int age;
    String power;
    String gender;
// constructor has the same name as the class
// constructor has no retutn type
    
    public Demon (){
        System.err.println("Welcome to Hell");
    }

    public Demon( String name , int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    
        if (gender == "Female") {
            power = "FLIGHT";
        } 
        else if (gender == "Male") {
            power = "NORMIE";
        }
        else {
            System.err.println("Gender incorrect");
        }
        System.out.println("Constructor runs");
    }

    public static void main(String[] args) { 
        Demon ghost = new Demon("Bhoo", 22, "Male");
        
        System.out.println(ghost.name);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(n + "X" + i + "=" + (n*i));
        }

        for (int i =2; i<=2000; i = i*2) {
            System.out.println(i);
        }
    }
}