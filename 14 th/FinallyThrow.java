import java.io.IOException;

public class FinallyThrow {

    static void checkAge(int age) throws IOException 
    {
        if (age < 18) 
            {
            throw new IOException("Age is less than 18");
        } 
        else 
            {
            System.out.println("Age is valid");
        }
    }

    public static void main(String args[]) {
        try {
            checkAge(18.5);
        } 
        catch (IOException e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally 
        {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues");
    }
}