import java.util.Scanner;
class Product {
	int pcode;
	String pname;
	double price;
	Product(int c, String n,double p){
		pcode= c;
		pname=n;
		price=p;
	}
}
public class LowestPrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of product 1: ");
		System.out.print("Code: ");
		int c1=sc.nextInt();
		System.out.print("Name: ");
		String n1=sc.next();
		System.out.print("Price: ");
		double p1=sc.nextDouble();
		System.out.println("Enter the details of product 2: ");
		System.out.print("Code: ");
		int c2=sc.nextInt();
		System.out.print("Name: ");
		String n2=sc.next();
		System.out.print("Price: ");
		double p2=sc.nextDouble();
		System.out.println("Enter the details of product 3: ");
		System.out.print("Code: ");
		int c3=sc.nextInt();
		System.out.print("Name: ");
		String n3=sc.next();
		System.out.print("Price: ");
		double p3=sc.nextDouble();
		Product prod1=new Product(c1,n1,p1);
		Product prod2=new Product(c2,n2,p2);
		Product prod3=new Product(c3,n3,p3);
		Product lowest=prod1;
		if(prod2.price<lowest.price)
			lowest=prod2;
		if(prod3.price<lowest.price)
			lowest=prod3;
		System.out.println("Product with Lowest price: ");
		System.out.println("Code: "+lowest.pcode);
		System.out.println("Name: "+lowest.pname);
		System.out.println("Code: "+lowest.price);
	}
}
