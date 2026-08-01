// Demonstration of final variable, final method and final class

// Final class
final class College
{
    void displayCollege()
    {
        System.out.println("College Name: SIT Pune");
    }
}

// Parent class
class Animal
{
    final void sound()
    {
        System.out.println("Animal makes different sound");
    }
}

// Child class
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

public class CollegeTest
{
    public static void main(String[] args)
    {
        // Final variable
        final int MAX_VALUE = 100;
        System.out.println("Max Value: " + MAX_VALUE);

        Dog d = new Dog();
        d.sound();   // Final method from Animal
        d.bark();    // Dog's own method

        College c = new College();
        c.displayCollege();
    }
}