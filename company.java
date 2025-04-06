import java.util.Scanner;

class Employee {
    int empId;
    String name;
    float salary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].getDetails();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Employee " + (i + 1));
            emp[i].displayDetails();
        }
    }
}
