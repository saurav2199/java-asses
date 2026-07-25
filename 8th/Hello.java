class Animal
{
    String color="White";
    Animal()
    {
        System.out.println("Animal Constr");
    }
    void sound()
    {
        System.out.println("Animal SOunds");
    }
}
class Dog extends Animal
{
    String color="Black";
    Dog()
    {
        super();
        System.out.println("Dog Constr");
    }
    void display()
    {
        System.out.println("Dog color: "+color);
         System.out.println("Animal color: "+super.color);
         super.sound();
    }
}
public class SuperKeywordDemo
{
    public static void main(String[]args)
    {
        Dog d=new Dog();
        d.display();
    }
}
