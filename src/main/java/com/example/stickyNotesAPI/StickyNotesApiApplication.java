package com.example.stickyNotesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StickyNotesApiApplication {

	public static void main(String[] args) {

		System.out.println("DB_URL = " + System.getenv("DB_URL"));
		System.out.println("DATABASE_URL = " + System.getenv("DATABASE_URL"));

		SpringApplication.run(StickyNotesApiApplication.class, args);


	}

}
