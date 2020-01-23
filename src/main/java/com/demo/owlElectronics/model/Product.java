package com.demo.owlElectronics.model;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data//Lombok functionality that provides boilerplate functionality, in this case the Getters and setter of the model
//todo review use before production
@Entity
@Table(name = "product")
public class Product {
    //productDTO is not used now, maybe used in future iterations
    //@Column annotation is used to define rules for the column during generation.
    //https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Column.html
    //@Id marks the variable as the primary key of the SQL table.
    //@GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GeneratedValue.html
    //GenerationType defines the types of primary key generation strategies.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GenerationType.html
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, unique = true)
    private int productID;

    @Column(nullable = false, length = 30, unique = true)
    private String productName;

    @Lob
    @Column(nullable = true)
    private byte[] image;
    // @TODO must become an image, futher research on BLOB (suggestion from erik)

    @Column(nullable = false, length = 1200)
    private String productDescription;

    @Column(nullable = false, length = 7)
    private String productPrice;
}
