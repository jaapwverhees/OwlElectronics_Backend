package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.CustomerRepository;
import com.demo.owlElectronics.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//ad this point in time this controller is not needed, probably needed in future iterations
@RestController
@RequestMapping(path="/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;


}

