package com.example.firstspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//
//public class FirstspringApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(FirstspringApplication.class, args);
//	}
//
//}
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