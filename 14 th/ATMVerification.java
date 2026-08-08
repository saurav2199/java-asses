import java.util.Scanner;

class InvalidPINException extends Exception {
    InvalidPINException(String message) {
        super(message);
    }
}

public class ATMVerification {

    static void verifyPIN(int pin) throws InvalidPINException {
        if (pin != 1234) {
            throw new InvalidPINException("Invalid PIN");
        } else {
            System.out.println("PIN is valid");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        try {
            verifyPIN(pin);
        }
        catch (InvalidPINException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("PIN verification process completed");
        }

        System.out.println("Program continues");

        sc.close();
    }
}