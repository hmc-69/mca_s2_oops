import java.util.*;

public class CharSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        char c[] = s.toCharArray();

        for(int i = 0; i < c.length; i++){
            for(int j = i+1; j < c.length; j++){
                if(c[i] > c[j]){
                    char t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }

        System.out.print("Sorted order: ");
        System.out.println(c);
    }
}

