import java.util.Scanner;

class InvalidVotingAgeException extends Exception
 {
    InvalidVotingAgeException(String message)
     {
        super(message);
    }
}

public class VotingSystem
 {

    static void checkAge(int age) throws InvalidVotingAgeException 
    {
        if (age < 18)
             {
            throw new InvalidVotingAgeException("Age is below 18");
        } else
             {
            System.out.println("User is eligible to vote");
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try
         {
            checkAge(age);
        }
        catch (InvalidVotingAgeException e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues");

        sc.close();
    }
}