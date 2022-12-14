package PredicateExamples;

import LamdaExamples.ConsumerExe.MyConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee( 1, 23, "M", "Rashik", "Khan" );
        Employee e2 = new Employee( 2, 13, "F", "rama", "krisnan" );
        Employee e3 = new Employee( 3, 43, "M", "john", "david" );
        Employee e4 = new Employee( 4, 26, "M", "Jon", "mike" );
        Employee e5 = new Employee( 5, 19, "F", "Cristine", "mariyam" );
        Employee e6 = new Employee( 6, 15, "M", "David", "robat" );
        Employee e7 = new Employee( 7, 68, "F", "joy", "son" );
        Employee e8 = new Employee( 8, 79, "M", "Alex", "john" );
        Employee e9 = new Employee( 9, 15, "F", "vera", "Singh" );
        Employee e10 = new Employee( 10, 45, "M", "Naveen", "Jain" );

        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll( Arrays.asList( new Employee[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10} ) );


        System.out.println( EmployeePredicates.filterEmployees( employees, EmployeePredicates.isAdultMale() ) );

        System.out.println( EmployeePredicates.filterEmployees( employees, EmployeePredicates.isAdultFemale() ) );

        System.out.println( EmployeePredicates.filterEmployees( employees, EmployeePredicates.isAgeMoreThan( 35 ) ) );

    }
}
