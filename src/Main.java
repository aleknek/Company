
public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("EFSOL");

        Employee employee1 = new Employee("Petr", 10000.00);
        Employee employee2 = new Employee("Aleksandr", 15000.00);
        Employee employee3 = new Employee("Marina", 20000.00);
        Employee employee4 = new Employee("Tatiana", 9000.50);
        Employee employee5 = new Employee("Aleksey", 14500.50);

        company.employ(employee1);
        company.employ(employee2);
        company.employ(employee3);
        company.employ(employee4);
        company.employ(employee5);

        company.printEmployeesSalary(10000.00);

        company.dismiss(employee1);
        company.dismiss(employee5);
    }
}
