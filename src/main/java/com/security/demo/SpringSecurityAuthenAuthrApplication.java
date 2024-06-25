package com.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAuthenAuthrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthenAuthrApplication.class, args);
		System.out.println("Auth-Authrization app is running now!!!");
	}

}
