import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGrouping {
    static class Employee {
        int id;
        String name;
        String dept;
        double salary;

        Employee(int id, String name, String dept, double salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getDept() { return dept; }
        public double getSalary() { return salary; }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", "IT", 50000),
                new Employee(2, "B", "IT", 60000),
                new Employee(3, "C", "HR", 40000),
                new Employee(4, "D", "HR", 50000)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("Input: Employee list");
        System.out.println("Average salary by department: " + result);
    }
}
