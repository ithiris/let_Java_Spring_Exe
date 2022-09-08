package PredicateExamples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class EmployeePredicates {


    public static Predicate<Employee> isAdultMale() {


        return emp -> emp.getAge() > 21 && emp.getGender().equalsIgnoreCase( "M" );
    }

    public static Predicate<Employee> isAdultFemale() {
        return emp -> emp.getAge() > 18 && emp.getGender().equalsIgnoreCase( "F" );
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return emp -> emp.getAge() > age;
    }


    public static List<Employee> filterEmployees(List<Employee> employees,
                                                 Predicate<Employee> predicate) {
        return employees.stream()
                .filter( predicate )
                .collect( Collectors.<Employee>toList() );
    }


}

