package com.example.msatest1.customer.service;
import com.example.msatest1.customer.entity.Customer;
import com.example.msatest1.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}