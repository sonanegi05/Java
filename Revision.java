/**
 * DataType *
 * Operators *
 * If-Else *
 * Class *
 * Objects *
 * Packages
 * Constructor *
 * Static
 * Interface
 * Wrapper
 * Scanner
 * Arrays
 * String
 * Loops
 * Inheritance
 * Polymorphism
 * Abstract class
 * Lambda
 * Recursion
 */
class Student {
    int id;
    String name;
    int age;

    // DEFAULT CONSTRUCTOR
    Student() {
        this.id = 0;
        this.name = "";
        this.age = 0;
    }

    // PARAMETERIZED CONSTRUCTOR
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // COPY CONSTRUCTOR
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
    }

    public boolean isElegibleToVote() {
        if(this.age >= 18)
            return true;
        else 
            return false;
    }
}


public class Revision {

    int add(int a, int b){
        return a + b;
    }
    
    int add(int a, int b, int c){
        return a+b+c;
    }
    void show(){
        System.out.println("I SHOWED YOU :D");
    }

    public static void main(String[] args) {
        // DATATYPES
        float f = 9.99f;
        double ff = 9.99;

        int n = 90;
        long nn = 90;

        // OPERATORS
        int a = 10;
        int b = 2;

        System.out.println(a % b);
        System.out.println(b % a);

        // both are same
        a = a + 2;
        a += 2;

        int one = 1;
        int two = 2;

        if(two < one) {
            System.out.println("One is bigger");
        } else if(two > one) {
            System.out.println("Two is bigger");
        } else {
            System.out.println("Both are equal");
        }

        // CLASSES
        // Student s1 = new Student();
        // Student s2 = new Student(1, "Kunal", 20);
        // Student s3 = new Student(s2);
        // System.out.println(s1.isElegibleToVote());
        // System.out.println(s2.isElegibleToVote());
    }
}