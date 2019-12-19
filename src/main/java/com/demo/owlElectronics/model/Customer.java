package com.demo.owlElectronics.model;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private int customer_id;

    @Column(nullable = false, length = 30)
    private String firstName;

    @Column(nullable = false, length = 30)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String streetName;

    @Column(nullable = false, length = 6)
    private String streetNumber;

    @Column(nullable = false, length = 6)
    private String ZipCode;

    @Column(nullable = false, length = 30)
    private String City;
    //customer is a parent for the class from, meaning that form has customer.customer_id as an foreign key
    //this is a One to One relationship
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Form form;

}
