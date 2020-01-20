package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.CustomerRepository;
import com.demo.owlElectronics.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//TODO implementation of Exception en Error handling. with faulty input the Database will sometimes write incomplete records
@RestController
@RequestMapping(path="/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    //TODO For testing purposes, needs to be reviewed before production
    @PostMapping(path="/add")
    public @ResponseBody String addNewCustomer (@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Saved";
    }

    //TODO For testing purposes, needs to be reviewed before production
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

