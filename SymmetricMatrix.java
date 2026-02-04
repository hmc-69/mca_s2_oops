import java.util.Scanner;
public class SymmetricMatrix {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();
		boolean symmetric = true;
		if (r!=c){
			System.out.print("It is not symmetric");
			return;
		}
		else{
			int A[][]=new int[r][c];
			System.out.println("Enter elements of A: ");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++) {
					A[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++) {
					if(A[i][j]!=A[j][i]){
						symmetric=false;
						break;
					}
				}
			}
			if(symmetric){
				System.out.print("Matrix is symmetric");
			}
			else{
				System.out.print("Matrix is not symmetric");
			}
		}
	}
}
