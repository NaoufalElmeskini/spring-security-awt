package com.cheerup.intranet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class IntranetApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntranetApplication.class, args);
	}

}
