package model.entity.demo;

public class Person {
    String name;
    int age;
    String phoneNumber;
    String gender;

    public Person() {
        System.out.println("This runs");
    }
 
    public Person(String name, int age, String phoneNumber, String gender) {
        System.out.println("Constructor runs");
    }
}
