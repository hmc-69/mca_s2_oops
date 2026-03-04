import java.util.*;
class Area{
	void area(double r){
		double a=3.14*r*r;
		System.out.println("Area of circle: "+a);
	}
	void area(int l, int b){
		int a=l*b;
		System.out.println("Area of rectangle: "+a);
	}
	void area(int s){
		int a=s*s;
		System.out.println("Area of square: "+a);			
	}
}
public class MethodOverload{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		System.out.println("Enter the length of the rectangle: ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle: ");
		int b = sc.nextInt();
		System.out.println("Enter the side of the square: ");
		int s = sc.nextInt();
		Area obj = new Area();
		obj.area(r);
		obj.area(l,b);
		obj.area(s);
	}
}
