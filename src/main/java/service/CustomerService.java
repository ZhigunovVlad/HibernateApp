package service;

import dao.CustomerDao;
import models.Avto;
import models.Customer;

import java.util.List;

public class CustomerService {

    private CustomerDao customerDao = new CustomerDao();

    public CustomerService() {
    }

    public Customer findCustomer(int id) {
        return customerDao.findById(id);
    }

    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerDao.delete(customer);
    }

    public void updateCustomer(Customer customer) {
        customerDao.update(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerDao.findAll();
    }

    public Avto findAvtoById(int id) {
        return customerDao.findAutoById(id);
    }
}