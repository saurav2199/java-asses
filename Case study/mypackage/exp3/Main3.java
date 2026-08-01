package mypackage.exp3;

public class Main3 {

    public static void main(String[] args) {

        System.out.println("===== Calculator =====");

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        Calculator c3 = new Calculator();

        System.out.println("Addition of 2 Integers : " + c1.add(10, 20));
        System.out.println("Addition of 2 Doubles  : " + c2.add(10.5, 20.5));
        System.out.println("Addition of 3 Integers : " + c3.add(10, 20, 30));

        Calculator.displayCount();

        System.out.println();

        System.out.println("===== Restaurant Billing =====");

        RestaurantBilling r1 = new RestaurantBilling();
        RestaurantBilling r2 = new RestaurantBilling();
        RestaurantBilling r3 = new RestaurantBilling();

        System.out.println("Dine-in Bill   : " + r1.bill(500, 100));
        System.out.println("Takeaway Bill  : " + r2.bill(400, 20, 1));
        System.out.println("Delivery Bill  : " + r3.bill(350, 20, 50));

        RestaurantBilling.displayOrders();
    }
}