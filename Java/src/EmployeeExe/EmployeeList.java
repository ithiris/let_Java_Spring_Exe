package EmployeeExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    Employee e1 = new Employee("John", 40, "BE");
    Employee e2 = new Employee("mike", 40, "MCA");
    Employee e3 = new Employee("robort", 40, "B.COM");
    Employee e4 = new Employee("kabeer", 33, "BE");
    Employee e5 = new Employee("mani", 36, "BE");
    Employee e6 = new Employee("krisna", 30, "MCA");
    Employee e7 = new Employee("jaffer", 45, "B.Tech");
    Employee e8 = new Employee("venkat", 48, "BE");
    Employee e9 = new Employee("Joshap", 50, "B.COM");
    Employee e10 = new Employee("bilal", 28, "BE");

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));

        return employees;
    }
}

