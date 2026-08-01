package mypackage.exp8;

public class Manager extends Employee {

    String department = "IT";

    Manager() {
        super();
    }

    void show() {

        super.display();

        System.out.println("Department    : " + department);
    }
}