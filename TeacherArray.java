import java.util.*;
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
class Teacher extends Employee {
    String department;
    String subject;
    Teacher(int id, String name, double salary, String department, String subject) {
        super(id, name, salary);
        this.department = department;
        this.subject = subject;
    }
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }
}
public class TeacherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] t = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();
            t[i] = new Teacher(id, name, sal, dept, sub);
        }
        System.out.println("\n===== Teacher List =====");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
        sc.close();
    }
}
