package mypackage.exp2;

public class Student {

    int rollNo;
    String name;

    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy Constructor
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}