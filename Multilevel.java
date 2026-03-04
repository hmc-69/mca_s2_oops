import java.util.*;
class Person {
    String name;
    String gender;
    String address;
    int age;
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}
class Employee extends Person {
    int Empid;
    String company_name;
    String qualification;
    Double salary;

    Employee(String name, String gender, String address, int age,
             int Empid, String company_name, String qualification, Double salary) {
        super(name, gender, address, age);
        this.Empid = Empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}
class Teacher extends Employee {
    String subject;
    String department;
    int teacherid;
    Teacher(String name, String gender, String address, int age,
            int Empid, String company_name, String qualification, Double salary,
            String subject, String department, int teacherid) {
        super(name, gender, address, age, Empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + Empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherid);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] t = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Emp ID: ");
            int Empid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Company Name: ");
            String company_name = sc.nextLine();
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Enter Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Teacher ID: ");
            int teacherid = sc.nextInt();
            sc.nextLine();
            t[i] = new Teacher(name, gender, address, age, Empid,
                    company_name, qualification, salary,
                    subject, department, teacherid);
        }
        System.out.println("\n===== Teacher List =====");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
        sc.close();
    }
}
