import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter start year: ");
		int start = sc.nextInt();
		System.out.print("Enter end year: ");
		int end = sc.nextInt();
		for(int year=start;year<=end;year++){
			if((year%4==0 && year%100!=0) || (year%400==0)){
				System.out.println(year);
			}
		} */
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println(year+" is a Leap year");
		} 
		else
			System.out.println(year+" is not a Leap year");
	}
}
