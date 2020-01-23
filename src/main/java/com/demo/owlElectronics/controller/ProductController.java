package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

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
        productRepository.save(product);
    }

    @PostMapping(value = "/setphoto/{productID}")
    public byte[] setPhoto(@PathVariable int productID, @RequestParam MultipartFile image){
        Product product = productRepository.findById(productID).get();
        byte[] byteArray= new byte[0];
        try {
            byteArray = image.getBytes();
        } catch (IOException e) {
            //implement error log function
            return null;
        }
        product.setImage(byteArray);
        productRepository.save(product);
        return product.getImage();
    }
}
