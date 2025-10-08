package objectOrientedprogramming.Abstract;

public class MainAbstractClass {

    //ABSTRACT = Used to define classes and methods.
    // Hide implementation details and show only essential details.
    // Can't be instantiated directly.
    // Can contain "ABSTRACT" methods (must be implemented)
    // Can contain "Concrete" methods (inherited)

    public static void main(String[] args) {

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(5, 5);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        circle.display();
        triangle.display();
        rectangle.display();
    }
}
