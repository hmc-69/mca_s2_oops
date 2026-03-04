import java.util.*;
public class Search{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
        	int n = sc.nextInt();
		System.out.print("Enter elements of array: ");  
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter key to be searched: ");      	
		int key = sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if(a[i]==key){
				System.out.println("Element found");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Element not found");
		}
	}
}
