import java.util.Scanner;
abstract class Shape{
    abstract void area();

}
class Rectangle extends Shape{
    double length,width;
        Rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }
        public void area(){
            System.out.println(length*width);
        }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;

    }
    public void area(){
        System.out.println(Math.PI*radius*radius);
    }
}
// Define the abstract Shape class with an abstract area() method

// Implement the Rectangle class that extends Shape

// Implement the Circle class that extends Shape

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangle
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Read the radius of the circle
        double radius = scanner.nextDouble();
        Shape rectangle=new Rectangle(length,width);
        rectangle.area();
        Shape circle=new Circle(radius);
        circle.area();
        // Create instances of Rectangle and Circle

        // Calculate and print the area of the rectangle

        // Calculate and print the area of the circle

        scanner.close();
    }
}