package EmployeeExe;

import java.util.ArrayList;
import java.util.List;

public class BuildEmployee {


    public List<Employee> particularAgeOfEmployeeList(List<Employee> employees, int age) {
        List<Employee> particularAgeOfEmployeeObj = new ArrayList<>();

        for (Employee employee:employees){
            if(employee.getAge() == age){
                particularAgeOfEmployeeObj.add(employee);
            }
        }

        return particularAgeOfEmployeeObj;
    }
    public List<Employee> maximumAgeEmployeeList(List<Employee> employees, int age) {
        List<Employee> maxAgeOfEmployeeObj = new ArrayList<>();
        for (Employee employee:employees){
            if (employee.getAge() >age){
                maxAgeOfEmployeeObj.add(employee);
            }
        }
        return maxAgeOfEmployeeObj;
    }

    public List<Employee> minimumAgeEmployeeList(List<Employee> employees, int age) {
        List<Employee> minAgeOfEmployeeObj = new ArrayList<>();
        for (Employee employee:employees){
            if (employee.getAge() < age){
                minAgeOfEmployeeObj.add(employee);
            }
        }
        return minAgeOfEmployeeObj;
    }


}

