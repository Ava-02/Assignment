import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id + " " + "Name: " + name + " " + "Salary: $" + salary );
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1021, "Avinash Mehra", 50000));
        employees.add(new Employee(1022, "Kunal Shekhawat", 60000));
        employees.add(new Employee(1023, "Yogesh rawat", 55000));

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
