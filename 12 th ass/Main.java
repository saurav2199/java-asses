import mypackage.Calculator;

public class Main 
{
    public static void main(String[] args) 
    {

        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.subtract(20, 10));
    }
}