package EmployeeExe;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int age = 40;

        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = employeeList.getEmployees();

        BuildEmployee buildEmployee = new BuildEmployee();
        System.out.println("40 Age List" + ": " + buildEmployee.particularAgeOfEmployeeList(employees, age));
        System.out.println("40 Age Above List" + " :" + buildEmployee.maximumAgeEmployeeList(employees, age));
        System.out.println("40 Age below List" + " :" + buildEmployee.minimumAgeEmployeeList(employees, age));
    }
}
