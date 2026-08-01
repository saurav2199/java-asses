class Animal
{
    final void sound()
    {
        System.out.println("Animal makes different sound");
    }
}

class Dog extends Animal
{
    
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class AnimalTest
{
    public static void main(String[] args)
    {
        Dog d = new Dog();   
    }
}