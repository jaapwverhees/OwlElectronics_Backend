package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.DTO.OrderDTO;
import com.demo.owlElectronics.data.CustomerRepository;
import com.demo.owlElectronics.data.OrderRepository;
import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Customer;
import com.demo.owlElectronics.model.Order;
import com.demo.owlElectronics.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= {"http://localhost:3000"})
@RequestMapping(path="/order")
public class OrderController {

    @Autowired(required = true)
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    //TODO frond end STUB voor bijv. betalingen.
    @PostMapping(path="/place")
    public void setOrder(@RequestBody OrderDTO orderDTO){
        Product product = productRepository.findById(orderDTO.getProduct().getProductID()).get();
        Customer customer = orderDTOToCustomerTransformer(orderDTO);
        customer = customerRepository.save(customer);
        Order order = new Order();
        order.setCustomer(customer);
        order.setProduct(product);
        orderRepository.save(order);
    }

    public Customer orderDTOToCustomerTransformer(OrderDTO orderDTO){
        Customer customer = new Customer();
        customer.setEmail(orderDTO.getCustomer().getEmail());
        customer.setZipCode(orderDTO.getCustomer().getZipCode());
        customer.setCity(orderDTO.getCustomer().getCity());
        customer.setStreetNumber(orderDTO.getCustomer().getStreetNumber());
        customer.setStreetName(orderDTO.getCustomer().getStreetName());
        customer.setLastName(orderDTO.getCustomer().getLastName());
        customer.setFirstName(orderDTO.getCustomer().getFirstName());
        return customer;
    }

}
