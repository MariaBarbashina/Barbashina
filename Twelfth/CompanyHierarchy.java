package Twelfth;

public class CompanyHierarchy {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria", "Developer");
        Employee employee2 = new Employee("Daria", "Designer");
        Employee employee3 = new Employee("Anzhelina", "Manager");
        Employee employee4 = new Employee("Veronika", "HR Specialist");
        Employee employee5 = new Employee("Artyom", "Programmer");

        Department developmentDepartment = new Department("Development Department");
        Department hrDepartment = new Department("HR Department");

        developmentDepartment.addComponent(employee1);
        developmentDepartment.addComponent(employee2);
        hrDepartment.addComponent(employee3);
        hrDepartment.addComponent(employee4);

        Department headOffice = new Department("Head Office");

        headOffice.addComponent(developmentDepartment);
        headOffice.addComponent(hrDepartment);

        headOffice.showDetails();
    }
}
