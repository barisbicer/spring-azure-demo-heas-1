package com.heas.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoHeas1Application {

	
	@GetMapping("/message")
	public String  message() {
		
		return "Congrats ! you app deployed successfully in Azure from HEAS.........!!!!!-3333333";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoHeas1Application.class, args);
	}

}
