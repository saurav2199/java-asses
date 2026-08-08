class invalidMarksException extends Exception
 {
     invalidMarksException(String message) 
    {
        super(message);
    }
}
public class UserDefine
 {
    static void checkMarks(int marks) throws invalidMarksException 
    {
        if (marks < 0 || marks > 100) 
        {
            throw new invalidMarksException("Marks should be between 0 and 100");
        } 
        else 
        {
            System.out.println("Marks are valid");
        }
    }

    public static void main(String args[]) {
        try {
            checkMarks(105);
        } 
        catch (invalidMarksException e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally 
        {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues");
    }
}