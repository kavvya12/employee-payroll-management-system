import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary per Day: ");
        double salaryPerDay = sc.nextDouble();

        System.out.print("Enter Days Present: ");
        int days = sc.nextInt();

        Employee emp = new Employee(id, name, salaryPerDay);
        Attendance att = new Attendance(days);

        double salary = Payroll.calculateSalary(emp, att);

        System.out.println("Name: " + emp.name);
        System.out.println("Total Salary: " + salary);
    }
}
