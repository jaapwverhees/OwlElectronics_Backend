package com.demo.owlElectronics.data;

import com.demo.owlElectronics.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //TODO check if correct use and location of annotation Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
