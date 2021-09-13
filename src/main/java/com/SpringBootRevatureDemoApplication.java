package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRevatureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRevatureDemoApplication.class, args);
	}

	@GetMapping()
	public String home() {
		return "Welcome to Home Page";
	}
	@GetMapping("/revatureTraining")
	public String revatureTraining() {
		return "Welcome to revature training - Tufail Ahmed";
	}
	@GetMapping("/mockInterviews")
	public String mock() {
		return "Welcome to Mock Interviews 1 and 2";
	}
}
