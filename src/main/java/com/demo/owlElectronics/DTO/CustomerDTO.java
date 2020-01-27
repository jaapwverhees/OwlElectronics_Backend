package com.demo.owlElectronics.DTO;

import lombok.*;

@Data
//lombok functionality that provides boilerplate functionality, in this case getters, setters, toString.
//https://projectlombok.org/features/all
//https://projectlombok.org/api/
@NoArgsConstructor
public class CustomerDTO {
    private String firstName;
    private String lastName;
    private String streetName;
    private String streetNumber;
    private String zipCode;
    private String City;
    private String email;
}
