package com.demo.owlElectronics.model;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, unique = true)
    private int product_id;

    @Column(nullable = false, length = 30, unique = true)
    private String productName;

    @Column(nullable = false, length = 500)
    private String image; // @TODO must become an image, futher research on BLOB (suggestion from erik)

    @Column(nullable = false, length = 600)
    private String productDescription;

    @Column(nullable = false, length = 7)
    private String productPrice;
    //product is a parent for the class from, meaning that form has product.product_id as an foreign key
    //this is a One to One relationship
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Form form;
}
