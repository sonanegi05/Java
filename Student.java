public class Student {
    int studentId;
    String studentName;
    int m2, m1, m3;
    String grade;

    public Student(int id, String name, int m1, int m2, int m3) {
        this.studentId = id;
        this.studentName = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void calculateAverage() {
        int avg = (m1 + m2 + m3)/3;
        System.out.println("Average: " + avg);

        // if - else logic for grading
        if (avg > 90) {
            grade = "A+";
            System.out.println("A+");
        }
        else if (avg >= 81) {
            grade = "A";
            System.out.println("A");
        } 
        else if (avg >= 71) {
            grade = "B";
            System.out.println("B");
        } 
        else {
            grade = "C";
            System.out.println("C");
        }
    }

    public static void main(String args[]) {
        Student s1 = new Student(1, "Chonu", 91, 92, 93);
        Student s2 = new Student(2, "Bhoo", 11, 11, 13);

        s1.calculateAverage();
        s2.calculateAverage();

        System.out.println("GRADE: " + s1.grade);
        System.out.println("GRADE: " + s2.grade);
    }
}