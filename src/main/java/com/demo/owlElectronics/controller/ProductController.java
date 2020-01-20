package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.DTO.ProductDTO;
import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//TODO implementation of Exception en Error handling. with faulty input the Database will sometimes write incomplete records
@RestController
@CrossOrigin(origins= {"http://localhost:3000"})
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

    @PostMapping(path="/place")
    public void setProduct(@ModelAttribute Product product){
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Product product = productDTOtoProduct(productDTO);
        productRepository.save(product);
    }

    public Product productDTOtoProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setProductName(productDTO.getProductName());
        product.setImage(productDTO.getImage());
        product.setProductDescription(productDTO.getProductDescription());
        product.setProductPrice(productDTO.getProductPrice());

        return product;
    }
}
