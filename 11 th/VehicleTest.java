// Interface
interface Vehicle
{
    void start();
    void stop();
}

class Car implements Vehicle
{
    // Constructor
    Car()
    {
        System.out.println("Car object created.");
    }

    public void start()
    {
        System.out.println("Car started.");
    }

    public void stop()
    {
        System.out.println("Car stopped.");
    }
}

class Bike implements Vehicle
{
    // Constructor
    Bike()
    {
        System.out.println("Bike object created.");
    }

    public void start()
    {
        System.out.println("Bike started.");
    }

    public void stop()
    {
        System.out.println("Bike stopped.");
    }
}

public class VehicleTest
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.start();
        c.stop();

        System.out.println();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}