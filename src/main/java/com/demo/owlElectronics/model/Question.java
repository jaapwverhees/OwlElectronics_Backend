package com.demo.owlElectronics.model;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Data
//lombok functionality that provides boilerplate functionality, in this case setters
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
//WARNING: your IDE may need a lombok plugin for this to work.
@Entity
@Table(name ="question")
//tablename Form is used because 'order' is an reserved SQL keyword.
public class Question {
    //@Column annotation is used to define rules for the column during generation.
    //https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Column.html
    //@Id marks the variable as the primary key of the SQL table.
    //@GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GeneratedValue.html
    //GenerationType defines the types of primary key generation strategies.
    //https://docs.oracle.com/javaee/7/api/javax/persistence/GenerationType.html
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="question_id", nullable = false)
    private int questionID;

    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Column(nullable = false, length = 30)
    private String lastName;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 600)
    private String inputQuestion;
}
