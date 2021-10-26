package com.datta.hibernate1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datta.hibernate1.Persistence.client;

@SpringBootApplication
public class Desafio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	
	public void run(String... args) throws Exception{
		client cliente = new client();
		
		
	}

}
