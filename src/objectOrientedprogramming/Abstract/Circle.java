package objectOrientedprogramming.Abstract;

public class Circle extends Shapes {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
