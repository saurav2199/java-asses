package mypackage.exp2;

public class Main2 {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(101, "Saurav");

        Student s3 = new Student(s2);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor");
        s2.display();

        System.out.println();

        System.out.println("Copy Constructor");
        s3.display();
    }
}