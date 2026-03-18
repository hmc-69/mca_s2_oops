import java.util.*;
class Shape {
	void area(){
		System.out.println("Area of the shape");
	}
}
class Rectangle extends Shape {
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rectangle");		
		System.out.print("Enter length: ");
		int l = sc.nextInt();
		System.out.print("Enter breadth: ");
		int b = sc.nextInt();
		int area = l*b;
		System.out.println("Area of rectangle = "+area);
	}
}
class Circle extends Shape {
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nCircle");
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		double area = 3.14*r*r;
		System.out.println("Area of circle = "+area);
	}
}
class Square extends Shape {
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSquare");		
		System.out.print("Enter side: ");
		int s = sc.nextInt();
		int area = s*s;
		System.out.println("Area of square = "+area);
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Square sq = new Square();
		rect.area();
		cir.area();
		sq.area();
	}
}
