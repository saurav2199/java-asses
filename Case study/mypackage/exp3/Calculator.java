package mypackage.exp3;

public class Calculator {

    static int count = 0;

    Calculator() {
        count++;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    static void displayCount() {
        System.out.println("Objects Created : " + count);
    }
}