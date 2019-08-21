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
	@Autowired
	private LambdasNews lam;

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

		// Method to cast text to colection List
		String arrayText = "1,2,3,4";
		System.out.println("arrayText: " + arrayText + " casted to List -> " + str.castTextToList(arrayText));

		// Methods to strip text
		String dirtyText = "  \n\t text to clean \u2005  ";
		System.out.println("dirtyText: " + dirtyText + " stripped -> " + str.stripText(dirtyText));
		System.out.println("dirtyText: " + dirtyText + " stripped Leading -> " + str.stripLeadingText(dirtyText));
		System.out.println("dirtyText: " + dirtyText + " stripped Trailing-> " + str.stripTrailingText(dirtyText));

		// Lambda filter with "var" type of value
		System.out.println("Filter pair values -> ");
		lam.filter("pair");
		System.out.println("Filter odd values -> ");
		lam.filter("odd");
		System.out.println("Sum values in functional interface -> " + lam.operation());
	}

}
