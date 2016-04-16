package com.zoudys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("spring-beans.xml")
public class BanqueIsSpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueIsSpringBootAngularApplication.class, args);
	}
}
