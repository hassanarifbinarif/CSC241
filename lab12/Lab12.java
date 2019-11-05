abstract class Shape {
    private String color;
    private Boolean filled;

    Shape() {
    }

    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape";
    }
}

class Circle extends Shape {
    private double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle (%.2f)", this.radius);
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return String.format("Rectangle (%.2f x %.2f)", this.length, this.width);
    }
}

class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, Boolean filled) {
        super(color, filled, side, side);
    }

    double getSide() {
        return super.getLength();
    }

    void setSide(double side) {
        super.setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    public String toString() {
        return String.format("Square (%.2f x %.2f)", getSide(), getSide());
    }
}

public class Lab12 {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // getRadius doesn't exist in type Shape
        //System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // abstract class cannot be constructed
        // Shape s2 = new Shape();

        Shape s3 = new Rectangle("RED", false, 1.0, 2.2);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // getLength
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // getSide doesn't exist in type shape
        // System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        // getSide doesn't exist in type Reactangle
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        // Upcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
