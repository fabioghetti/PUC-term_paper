package com.ghetti.fabio.bi.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiIntegrationApplication.class, args);
	}
}
