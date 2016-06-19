
public class Company {

    private String name;
    private Employee[] employees = new Employee[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void employ(Employee employee) {

        for (int i = 0; i < employees.length; i++)
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
    }

    public void dismiss(Employee employee) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] == employee) {
                employees[i] = null;
                break;
            }
    }

    public void printEmployeesSalary(double salary) {
        System.out.println("Employees with a salary higher than " + salary + " are:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() > salary) {
                System.out.println(employees[i].getName());
            }
        }
    }
}
