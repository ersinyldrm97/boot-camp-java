package com.example.rentACar;

import com.example.rentACar.core.utilities.mappers.ModelMapperManager;
import com.example.rentACar.core.utilities.mappers.ModelMapperService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	//localhost:8080/swagger-ui/index.html
	//working with springdoc as html page

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
