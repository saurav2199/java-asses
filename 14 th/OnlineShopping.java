import java.util.Scanner;

public class OnlineShopping {

    static void checkQuantity(int quantity) {
        try {
            if (quantity <= 0) {
                throw new Exception("Product quantity should be greater than 0");
            } else {
                System.out.println("Product quantity is valid");
                System.out.println("Quantity: " + quantity);
            }
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        checkQuantity(quantity);

        System.out.println("Program continues");

        sc.close();
    }
}