package com.aprender.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleappApplication {

	public static void main(String[] args) {
		System.out.println(" Application Started Successfully ");
		SpringApplication.run(SampleappApplication.class, args);
		System.out.println(" Application Stopped Successfully ");
	}

}
