package org.example.cabbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.example")
@EntityScan(basePackages = "org.example")
@EnableJpaRepositories(basePackages = "org.example")
public class CabbookingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabbookingApiApplication.class, args);
	}

}
