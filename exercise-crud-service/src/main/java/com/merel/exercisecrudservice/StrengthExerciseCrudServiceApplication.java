package com.merel.exercisecrudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StrengthExerciseCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrengthExerciseCrudServiceApplication.class, args);
	}

}
