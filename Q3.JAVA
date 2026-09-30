class Employee {
    
    private int employeeId;
    private String employeeName;
    private double salary;

    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary! Salary cannot be negative.");
        } else if (salary > 1000000) {
            System.out.println("Invalid salary! Salary cannot be greater than ₹1,000,000.");
        } else {
            this.salary = salary;
            System.out.println("Salary set successfully: ₹" + salary);
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

    
        employee.setEmployeeId(101);
        employee.setEmployeeName("Rahul");

        
        employee.setSalary(750000);

        
        employee.setSalary(-50000);

        
        employee.setSalary(1500000);

    
        employee.displayDetails();
    }
}
