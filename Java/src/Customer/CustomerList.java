package Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerList {


    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        Customer c1 = new Customer(35, "mohamed", "zubair");
        Customer c2 = new Customer(31, "ithiris", "shabi");
        Customer c3 = new Customer(25, "rashik", "khan");
        Customer c4 = new Customer(26, "fawaz", "ahmad");
        Customer c5 = new Customer(30, "umar", "farooq");
        Customer c6 = new Customer(38, "jamal", "rifaye");
        Customer c7 = new Customer(21, "mani", "kana");
        Customer c8 = new Customer(24, "dinesh", "kumar");
        Customer c9 = new Customer(29, "fayaz", "ahmad");
        Customer c10 = new Customer(27, "vijay", "kumar");

        customerList.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));
        return customerList;
    }
}
