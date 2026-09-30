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
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public double calculateSalary() {
        return salary;
    }
}

interface Researcher {
    void conductResearch();
}

class Teacher extends Employee implements Researcher {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teacher is teaching " + subject);
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher is conducting research");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 10000;
    }
}

class VisitingTeacher extends Teacher {
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * 1000;
    }
}

class Admin extends Employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println("Admin is managing " + department + " department");
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Rahul");
        teacher.setSalary(50000);
        teacher.setSubject("Java");

        System.out.println("Teacher Details");
        teacher.displayDetails();
        teacher.teach();
        teacher.conductResearch();
        System.out.println("Teacher Salary: " + teacher.calculateSalary());

        System.out.println();

        VisitingTeacher visitingTeacher = new VisitingTeacher();
        visitingTeacher.setEmployeeId(102);
        visitingTeacher.setEmployeeName("Amit");
        visitingTeacher.setSalary(30000);
        visitingTeacher.setSubject("Python");
        visitingTeacher.setHoursWorked(20);

        System.out.println("Visiting Teacher Details");
        visitingTeacher.displayDetails();
        visitingTeacher.teach();
        visitingTeacher.conductResearch();
        System.out.println("Visiting Teacher Salary: " + visitingTeacher.calculateSalary());

        System.out.println();

        Admin admin = new Admin();
        admin.setEmployeeId(103);
        admin.setEmployeeName("Priya");
        admin.setSalary(60000);
        admin.setDepartment("Administration");

        System.out.println("Admin Details");
        admin.displayDetails();
        admin.manageDepartment();
        System.out.println("Admin Salary: " + admin.calculateSalary());
    }
}
