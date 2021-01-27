package com.example.suhiru.projectsunsolar.service;

import com.example.suhiru.projectsunsolar.model.Customer;
import com.example.suhiru.projectsunsolar.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {


    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //This method is not used,only for testing purpose
    public Customer findCustomerById(Integer customerCode){

        return customerRepository.findById(customerCode).orElseThrow(RuntimeException::new);
    }

    //save method
    public String saveCustomer(Customer customer){

        customerRepository.save(customer);
        return "Saved Customer";
    }
}
