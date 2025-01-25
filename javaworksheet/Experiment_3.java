package Ashish_4th2025;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 30000;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.displayEmployeeDetails();

        System.out.println();

        Employee emp2 = new Employee("Ashish Mishra");
        emp2.displayEmployeeDetails();
    }
}
