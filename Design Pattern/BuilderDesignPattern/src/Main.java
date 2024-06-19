import employee.EmployeeBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBuilder employee1 = new EmployeeBuilder().setId(1)
                .setFirstName("Satya")
                .setLastName("Samantroy")
                .setAge(25)
                .setEmail("satya@gmail.com")
                .build();


        System.out.println(employee1);
    }
}