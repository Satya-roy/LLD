package employee;

public class EmployeeBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String designation;
    private String email;
    private int salary;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder build() {
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
