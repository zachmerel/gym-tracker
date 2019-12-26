package com.merel.exercisecrudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExerciseCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseCrudServiceApplication.class, args);
	}

}
