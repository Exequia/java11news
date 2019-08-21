package com.fnx.java11news;

import com.fnx.java11news.interfaces.IStringNews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	@Autowired
	private IStringNews str;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// test to check if application runs correctly
		String greating = " Hola Mundo desde Java 11.";
		System.out.println(greating.repeat(3));

		// Method to check if string is empty or not
		System.out.println("next result should be true -> " + str.checkEmptyText(""));
		System.out.println("next result should be false -> " + str.checkEmptyText(greating));
	}

}
