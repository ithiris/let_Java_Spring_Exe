package Customer;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomerList customerList = new CustomerList();
        List<Customer> listOfCustomer = customerList.getCustomerList();

        BuildCustomer buildCustomer = new BuildCustomer();
        System.out.println("Average Age is" + buildCustomer.findAverageCustomerAge(listOfCustomer));
        System.out.println("Max Obj" + " " + buildCustomer.maxAgeCustomer(listOfCustomer));
        System.out.println("Min Obj" + " " + buildCustomer.minAgeCustomer(listOfCustomer));
        System.out.println("Maximum Age Customer" + buildCustomer.maximumCustomerAgeObj(listOfCustomer));
        System.out.println("Minimum Age Customer " + buildCustomer.minimumCustomerAgeObj(listOfCustomer));


    }
}

