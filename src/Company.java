
public class Company {

    private String name;
    private Employee[] employees;

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

        if (employees == null) {
            this.employees = new Employee[5];
        }

        if (addEmployee(employee) == true) {
            return;
        } else {
            this.employees = IncreasedArray();
            addEmployee(employee);
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

    private boolean addEmployee(Employee employee) {

        boolean isSuccess = false;

        for (int i = 0; i < employees.length; i++)
            if (employees[i] == null) {
                employees[i] = employee;
                isSuccess = true;
                break;
            }
        return isSuccess;
    }

    private Employee[] IncreasedArray() {

        Employee[] employeesNew = new Employee[employees.length + 5];
        for (int i = 0; i < employees.length; i++) {
            employeesNew[i] = employees[i];
        }
        return employeesNew;
    }

}
