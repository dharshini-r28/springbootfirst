package com.example.firstspring.Service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EntityScan(basePackages = "com.example.firstspring.entity")
public class FirstspringApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);
	}
}