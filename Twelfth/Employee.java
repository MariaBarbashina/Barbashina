package Twelfth;

public class Employee implements CompanyComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
