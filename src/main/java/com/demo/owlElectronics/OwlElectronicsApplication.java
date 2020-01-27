package com.demo.owlElectronics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class OwlElectronicsApplication {
	//TODO implement a @PostConstructclass for instatnciation on startup http://dolszewski.com/spring/running-code-on-spring-boot-startup/
	public static void main(String[] args) {
		SpringApplication.run(OwlElectronicsApplication.class, args);
	}
}
