package com.grpc.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class MicroservicebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicebApplication.class, args);
	}

}
