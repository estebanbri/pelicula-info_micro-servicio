package com.esteban.peliculainfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PeliculaInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculaInfoServiceApplication.class, args);
	}

}
