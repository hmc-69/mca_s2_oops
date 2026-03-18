import java.util.Scanner;
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}
public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter number of values");
        n = sc.nextInt();
        try {
       	System.out.println("Enter values: ");
       	for(int i=0;i<n;i++) {
                	int num = sc.nextInt();
                	if(num < 0)
                    		throw new NegativeNumberException("Negative number not allowed");
                sum += num;
            }
            double avg = (double)sum/n;
            System.out.println("Average = " + avg);
        }
        catch(NegativeNumberException e) {
            System.out.println(e);
        }
    }
}
