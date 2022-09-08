package Customer;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomerList customerList = new CustomerList();
       List <Customer>listOfCustomer = customerList.getCustomerList();

        BuildCustomer buildCustomer = new BuildCustomer();
        System.out.println("Average Age is" + buildCustomer.findAverageAge(listOfCustomer));
        System.out.println("Maximum Age Customer" +buildCustomer.maximumCustomerAgeObj(listOfCustomer));
        System.out.println("Minimum Age Customer " +buildCustomer.minimumCustomerAgeObj(listOfCustomer));



    }
}

