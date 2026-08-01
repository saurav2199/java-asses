
abstract class Shape
{
    abstract void display();
}

class Circle extends Shape
{
    void display()
    {
        System.out.println("Draw the circle");
    }
}
class Square extends Shape
{
    void display()
    {
        System.out.println("Draw the square");
    }
}

public class ShapeTest
{
    public static void main(String[] args)
    {
        Shape s = new Circle();
        s.display();
        Shape s2 = new Square();
        s2.display();
    }
}