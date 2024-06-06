import employee.EmployeeImpl;
import employee.EmployeeProxy;
import employee.IEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEmployee employeeImpl = new EmployeeImpl(1, "Satya", "Engineer", 32);
        IEmployee employee = new EmployeeProxy();
    }
}