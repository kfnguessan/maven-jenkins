package com.example.maven;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
    }

}
