class Shape {
    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    private static final double PI = Math.PI;
    private double diameter;

    Circle (double diameter) {
        this.diameter = diameter;
    }

    public double area() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(5.0, 4.0);
        Shape larger = getLargerShape(s1, s2);

        System.out.println("The area of the larger shape is: " + larger.area());
    }

    public static Shape getLargerShape(Shape s1, Shape s2) {
        if (s1.area() > s2.area()) 
            return s1;
        else
            return s2;
    }
}