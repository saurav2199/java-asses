package mypackage.exp6;

interface DeliveryStatus {
    void status();
}

public class Main6 {

    public static void main(String[] args) {

        FoodDelivery fd = new FoodDelivery();

        // Creating Inner Class Object
        FoodDelivery.Order order = fd.new Order();

        order.displayOrder();

        // Anonymous Class
        DeliveryStatus ds = new DeliveryStatus() {

            public void status() {
                System.out.println("Delivery Status : Order Delivered Successfully");
            }
        };

        ds.status();
    }
}