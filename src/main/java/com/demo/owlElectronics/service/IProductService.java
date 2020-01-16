package com.demo.owlElectronics.service;

import com.demo.owlElectronics.model.Product;

import java.util.Optional;

public interface IProductService {
    Optional<Product> findById(int id);
}
