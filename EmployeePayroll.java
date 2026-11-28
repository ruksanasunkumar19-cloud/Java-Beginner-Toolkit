
import java.util.Scanner;

class Employee {

    String name;
    int employeeId;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    // Constructor
    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    // Calculate salary
    void calculateSalary() {

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        grossSalary = basicSalary + hra + da;
    }

    // Display salary slip
    void displaySalarySlip() {

        System.out.println("\n===== EMPLOYEE SALARY SLIP =====");

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);

        System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);
        System.out.printf("HRA (20%%): Rs. %.2f%n", hra);
        System.out.printf("DA (10%%): Rs. %.2f%n", da);

        System.out.println("-------------------------------");

        System.out.printf("Gross Salary: Rs. %.2f%n", grossSalary);

        System.out.println("===============================");
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE PAYROLL SYSTEM =====");

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
            sc.close();
            return;
        }

        // Create employee object
        Employee emp = new Employee(name, id, salary);

        // Calculate salary
        emp.calculateSalary();

        // Display salary slip
        emp.displaySalarySlip();

        sc.close();
    }
}
