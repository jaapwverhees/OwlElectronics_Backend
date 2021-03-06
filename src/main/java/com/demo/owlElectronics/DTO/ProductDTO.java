package com.demo.owlElectronics.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import java.io.File;

@Data
//lombok functionality that provides boilerplate functionality, in this case getters, setters, toString.
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
@NoArgsConstructor
public class ProductDTO {
    private int productID;
    private String productName;
    private byte[] image;
    // @TODO must become an image, futher research on BLOB (suggestion from erik)
    private String productDescription;
    private float productPrice;
}
