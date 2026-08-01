package mypackage.exp7;

public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}