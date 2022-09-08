package Customer;

import java.util.ArrayList;
import java.util.List;


public class BuildCustomer {


    public int findAverageAge(List<Customer> customerList) {

        int averageAge = 0;
        for (Customer customer : customerList) {
            averageAge = averageAge + customer.getAge();
        }
        averageAge = averageAge / customerList.size();

        return averageAge;
    }

    public List<Customer> maximumCustomerAgeObj(List<Customer> customerList) {
        List<Customer> maxCustomerObj = new ArrayList<>();
        int maximum = customerList.get(0).getAge();
        for (Customer customer : customerList) {
            if (maximum < customer.getAge()) {
                maxCustomerObj.add(customer);

            }


        }
        return maxCustomerObj;
    }

    public List<Customer> minimumCustomerAgeObj(List<Customer> customerList) {

        List<Customer> minAgeCustomerObj = new ArrayList<>();
        int minimum = customerList.get(0).getAge();
        for (Customer customer : customerList) {
            if (minimum > customer.getAge()) {
                minAgeCustomerObj.add(customer);

            }
        }
        return minAgeCustomerObj;
    }
}
