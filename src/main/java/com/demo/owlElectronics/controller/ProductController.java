package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public void setProduct(Product product){
        productRepository.save(product);
    }

    //TODO This is for now an acceptable implementation. if there are far more products, this should be directly queried in the DB.
    @GetMapping(value="/searchproduct/{query}")
    public List<Product> findByName(@PathVariable String query) {
        List<Product> productList = (List<Product>) productRepository.findAll();
        List<Product> returnList = new ArrayList<>();
        for (Product product: productList) {
            if(product.getProductName().toLowerCase().contains(query.toLowerCase())){
                returnList.add(product);
            }
        }
        return returnList;
    }

    public byte[] setPhoto(int productID, MultipartFile image){
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
