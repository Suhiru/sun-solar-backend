package com.example.suhiru.projectsunsolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ProjectSunsolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSunsolarApplication.class, args);
	}

}
