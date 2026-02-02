class Employee {

    String firstName;
    String lastName;
    double monthlySalary;

    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        if (s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0.0;
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }
}


public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Snehal", "Patil", 20000);
        Employee e2 = new Employee("Siddhi", "khot", 30000);

        System.out.println("Yearly Salary:");
        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());

        // 10% raise
        e1.monthlySalary = e1.monthlySalary * 1.10;
        e2.monthlySalary = e2.monthlySalary * 1.10;

        System.out.println("After 10% Raise:");
        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
    }
}