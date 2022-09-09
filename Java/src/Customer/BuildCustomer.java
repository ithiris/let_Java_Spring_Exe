package Customer;

import java.util.ArrayList;
import java.util.List;


public class BuildCustomer {


    public int findAverageCustomerAge(List<Customer> customerList) {

        int totalAge = 0;
        for (Customer customer : customerList) {
            totalAge = totalAge + customer.getAge();
        }
        int averageAge = totalAge / customerList.size();
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

    public Customer maxAgeCustomer(List<Customer> customerList) {
        int maximum = customerList.get(0).getAge();
        Customer customerMaxObj = null;
        for (Customer customer : customerList) {
            if (maximum < customer.getAge()) {
                customerMaxObj = customer;
                maximum = customerMaxObj.getAge();
            }

        }
        return customerMaxObj;
    }

    public Customer minAgeCustomer(List<Customer> customerList) {
        int minimum = customerList.get(0).getAge();
        Customer customerMinObj = null;
        for (Customer customer : customerList) {
            if (minimum > customer.getAge()) {
                customerMinObj = customer;
                minimum = customerMinObj.getAge();
            }

        }
        return customerMinObj;
    }

}
