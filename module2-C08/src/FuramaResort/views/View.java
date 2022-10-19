package FuramaResort.views;

import FuramaResort.controllers.FuramaController;
import FuramaResort.models.Customer;
import FuramaResort.services.CustomerService;
import FuramaResort.services.impl.CustomerServiceImpl;

public class View {
    public static void main(String[] args) {
//     FuramaController furamaController = new FuramaController();
//        furamaController.displayMainMenu();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.addCustomerList();
    }


}
