package mypackage.exp8;

public class Employee {

    String name = "Saurav";
    int empId = 101;

    Employee() {
        System.out.println("Employee Constructor Called");
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
    }
}