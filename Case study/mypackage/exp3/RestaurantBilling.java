package mypackage.exp3;

public class RestaurantBilling {

    static int totalOrders = 0;

    RestaurantBilling() {
        totalOrders++;
    }

    double bill(double food, double drinks) {
        return food + drinks;
    }

    double bill(double food, double packing, int takeaway) {
        return food + packing;
    }

    double bill(double food, double packing, double delivery) {
        return food + packing + delivery;
    }

    static void displayOrders() {
        System.out.println("Total Orders : " + totalOrders);
    }
}