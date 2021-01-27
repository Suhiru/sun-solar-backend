package com.example.suhiru.projectsunsolar.controller;

import com.example.suhiru.projectsunsolar.model.Customer;
import com.example.suhiru.projectsunsolar.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CustomerController {


    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerCode}")
    private Customer findCustomerById(@PathVariable("customerCode") Integer customerCode){

       return customerService.findCustomerById(customerCode);
    }

    @PostMapping(value = "/insertCustomer")
    private String insertCustomer(@RequestBody Customer customer){

        return customerService.saveCustomer(customer);
    }
}
