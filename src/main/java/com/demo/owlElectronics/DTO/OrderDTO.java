package com.demo.owlElectronics.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//lombok functionality that provides boilerplate functionality, in this case getters, setters, toString.
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
@NoArgsConstructor
public class OrderDTO {
    private CustomerDTO customer;
    private ProductDTO product;
}
