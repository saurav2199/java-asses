package mypackage;
//user defined class
public class Calculator 
{
    // method to add two numbers
    public int add(int a, int b) 
    {
        return a + b;
    }

    // method to subtract two numbers
    public int subtract(int a, int b) 
    {
        return a - b;
    }

    // method to multiply two numbers
    public int multiply(int a, int b) 
    {
        return a * b;
    }

    // method to divide two numbers
    public double divide(int a, int b) 
    {
        if (b == 0) 
            {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
