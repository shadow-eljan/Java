package objectOrientedprogramming.Abstract;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shapes{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

