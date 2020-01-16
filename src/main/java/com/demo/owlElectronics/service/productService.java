package com.demo.owlElectronics.service;

import com.demo.owlElectronics.data.ProductRepository;
import com.demo.owlElectronics.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class productService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> findById(int id) {

        return productRepository.findById(id);
    }
}
