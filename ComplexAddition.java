import java.util.Scanner;
class Complex {
	int real,imag;
	Complex(int r, int i) {
		real = r;
		imag = i;
	}
}
public class ComplexAddition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of first number: ");
		int r1= sc.nextInt();
		int i1= sc.nextInt();
		System.out.println("Enter the real and imaginary part of second number: ");
		int r2= sc.nextInt();
		int i2= sc.nextInt();
		Complex c1= new Complex(r1,i1);
		Complex c2= new Complex(r2,i2);
		int realSum=c1.real+c2.real;
		int imagSum=c1.imag+c2.imag;
		System.out.println("Sum: "+realSum+" + "+imagSum+"i");
	}
}
