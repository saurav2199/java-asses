class InvalidWithdrawalException extends Exception {
    InvalidWithdrawalException(String message) {
        super(message);
    }
}

public class ATM {
    
    static void withdraw(int amount) throws InvalidWithdrawalException {
        if (amount <= 0) {
            throw new InvalidWithdrawalException("Withdrawal amount should be greater than 0");
        } else {
            System.out.println("Withdrawal amount is valid");
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public static void main(String args[]) {
        try {
            withdraw(-500);
        } 
        catch (InvalidWithdrawalException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues");
    }
}