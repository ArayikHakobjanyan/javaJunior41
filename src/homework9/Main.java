package homework9;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area - " + triangle.calculateArea());
        System.out.println("Triangle perimeter - " + triangle.calculatePermietr());


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area - " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter - " + rectangle.calculatePerimetr());


        Square square = new Square(5);
        System.out.println("Square area - " + square.calculateArea());
        System.out.println("Square perimeter - " + square.calculatePerimetr());



        Circle circle = new Circle(6);
        System.out.println("Circle area - " + circle.calculateArea());
        System.out.println("Circle Perimeter - " + circle.calculatePerimetr());


        Oval oval = new Oval(7, 9);
        System.out.println("Oval area - " + oval.calculateArea());
        System.out.println("Oval Perimeter - " + oval.calculatePerimeter());
    }

}
