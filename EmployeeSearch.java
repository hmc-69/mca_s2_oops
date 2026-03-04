import java.util.*;

class Employee {
    int eno;
    String ename;
    double salary;
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter employee number: ");
            emp[i].eno = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter employee name: ");
            emp[i].ename = sc.nextLine();

            System.out.print("Enter salary: ");
            emp[i].salary = sc.nextDouble();
        }

        System.out.print("\nEnter employee number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eno == search) {
                System.out.println("\nEmployee Found");
                System.out.println("Number: " + emp[i].eno);
                System.out.println("Name: " + emp[i].ename);
                System.out.println("Salary: " + emp[i].salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }
}

