package FuramaResort.services.impl;

import FuramaResort.models.Customer;
import FuramaResort.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    public static void addCustomerList() {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Customer customer2 = new Customer("Nguyen Van 1", 20);
        Customer customer3 = new Customer("Nguyen Van 2", 20);
        Customer customer4 = new Customer("Nguyen Van 3", 20);
        Customer customer5 = new Customer("Nguyen Van 4", 20);
        List<Customer> arrayListCustomerList = new ArrayList<>();
        arrayListCustomerList.add(customer1);
        arrayListCustomerList.add(customer2);
        arrayListCustomerList.add(customer3);
        arrayListCustomerList.add(customer4);
        arrayListCustomerList.add(customer5);
        showCustomerListIn(arrayListCustomerList);

    }
    public  static void removeCustomerList(){
        
    }
    public static void showCustomerListIn(List<Customer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Customer" + (i+1) + " is name: " + array.get(i).getNameCustomer()+ " tuổi "+array.get(i).getAgeCustomer());
        }
    }




}


