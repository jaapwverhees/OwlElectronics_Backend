package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= {"*"}) //TODO this is a quick workaround, because it doesn't work for findByProductID. should be: origins=http://localhost:3000
@RequestMapping(path="/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/all")
    //TODO review if the use of a DTO is needed.
    public @ResponseBody
    Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value="/single/{productID}")
    public Product findByProductId(@PathVariable int productID) {
        return productRepository.findById(productID).get();
    }
}
