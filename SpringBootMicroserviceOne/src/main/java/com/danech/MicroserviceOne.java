package com.danech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class MicroserviceOne {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOne.class, args);
	}
	@GetMapping("welcome-one")
	public String welcome() {
		return "Welcome one";
	}
}