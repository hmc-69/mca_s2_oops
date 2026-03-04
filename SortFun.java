import java.util.*;

public class SortFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String s[] = new String[n];

        for(int i = 0; i < n; i++){
            s[i] = sc.nextLine();
        }

        Arrays.sort(s);

        System.out.println("Sorted strings:");
        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }

    }
}

