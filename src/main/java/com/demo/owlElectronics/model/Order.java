package com.demo.owlElectronics.model;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Setter
//lombok functionality that provides boilerplate functionality, in this case setters
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
//WARNING: your IDE may need a lombok plugin for this to work.
@Entity
@Table(name ="form")
//tablename Form is used because 'order' is an reserved SQL keyword.
public class Order {
    //@Column annotation is used to define rules for the column during generation.
    //https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Column.html
    //@Id marks the variable as the primary key of the SQL table.
    //@GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GeneratedValue.html
    //GenerationType defines the types of primary key generation strategies.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GenerationType.html
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_id", nullable = false)
    private int orderID;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
}
