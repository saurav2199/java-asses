package mypackage.exp6;

public class FoodDelivery {

    String customerName = "Saurav";

    // Inner Class
    class Order {

        String food = "Pizza";
        int quantity = 2;

        void displayOrder() {
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + food);
            System.out.println("Quantity      : " + quantity);
        }
    }
}