package com.demo.owlElectronics.model;

import lombok.Data;
import javax.persistence.*;

@Data
//lombok functionality that provides boilerplate functionality, in this case getters, setters, toString.
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
//todo review use @Data
@Entity
@Table(name = "customer")
public class Customer {
    //@Column annotation is used to define rules for the column during generation.
    //https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Column.html
    //@Id marks the variable as the primary key of the SQL table.
    //@GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GeneratedValue.html
    //GenerationType defines the types of primary key generation strategies.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GenerationType.html
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private int customerID;

    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Column(nullable = false, length = 30)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String streetName;

    @Column(nullable = false, length = 6)
    private String streetNumber;

    @Column(nullable = false, length = 6)
    private String zipCode;

    @Column(nullable = false, length = 30)
    private String city;

    @Column(nullable = false, length = 30)
    private String email;
}
