package com.example.topaz.adddeletedbjpaproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = CustomEntityRepository.class)
public class AddDeleteDbJpaProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddDeleteDbJpaProjApplication.class, args);
	}

}
