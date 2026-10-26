package com.stickybytes.Stickybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories
@EntityScan
//@ComponentScan(basePackages = {"com.stickybytes.Stickybytes.Controller"})
public class StickybytesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickybytesApplication.class, args);
	}

}
