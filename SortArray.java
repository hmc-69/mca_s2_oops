import java.util.*;
public class SortArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in){
			System.out.print("Enter number of strings: "};
			int n = sc.nextInt();
			String arr[] = new String(n);
			System.out.println("Enter the string: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLine();
			}
			Arrays.sort(arr)
