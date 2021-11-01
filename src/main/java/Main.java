import models.*;
import service.CustomerService;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        CustomerService CustomerService = new CustomerService();
        Customer customer = new Customer("Vlad",20);
        CustomerService.saveCustomer(customer);
        Avto VW = new Avto("Volkswagen", "black");
        VW.setCustomer(customer);
        customer.addAvto(VW);
        Avto ford = new Avto("Ford", "black");
        ford.setCustomer(customer);
        customer.addAvto(ford);
        CustomerService.updateCustomer(customer);
    }
}

