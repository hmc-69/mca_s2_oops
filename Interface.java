import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}
class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public void area() {
        System.out.println("Area = " + (3.14 * r * r));
    }
    public void perimeter() {
        System.out.println("Perimeter = " + (2 * 3.14 * r));
    }
}
class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public void area() {
        System.out.println("Area = " + (l * b));
    }
    public void perimeter() {
        System.out.println("Perimeter = " + (2 * (l + b)));
    }
}
public class Interface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.Circle  2.Rectangle  3.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (ch != 3);
        sc.close();
    }
}
