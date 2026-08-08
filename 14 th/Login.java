class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Login {

    static void checkPassword(String password) throws InvalidPasswordException {
        if (!password.equals("java123")) {
            throw new InvalidPasswordException("Invalid password");
        } else {
            System.out.println("Login successful");
        }
    }

    public static void main(String args[]) {
        try {
            checkPassword("java456");
        }
        catch (InvalidPasswordException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues");
    }
}