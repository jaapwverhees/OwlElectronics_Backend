package com.demo.owlElectronics.model;
import javax.persistence.*;

@Entity
@Table(name ="form")
//Classname Form is used because 'order' is an reserved SQL keyword.
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_id", nullable = false)
    private int orderID;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
