package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProxy implements IEmployee{
    List<IEmployee> employeeCache = new ArrayList<>();
    public EmployeeProxy() {
    }

    public IEmployee createEmployee(int id, String name, String designation, int salary) {
        IEmployee employee = new EmployeeImpl(id, name, designation, salary);
        employeeCache.add(employee);
        if(employeeCache.contains(employee)) {
            System.out.println("Employee present in cache return the employee");
        } else {

            employeeCache.add(employee);
            System.out.println("Cache miss : create the employee");
        }
        return employee;
    }
}
