/*
 * @(#)PhoneBookApplication.java 1.0 26/04/2018
 *
 * Copyright (c) 2018, GSW. All rights reserved.
 */

package br.com.gsw.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * {@code PhoneBookApplication}
 *
 * @author Danilo Ambrosio
 * @version 1.0 26/04/2018
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PhoneBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}
	
}
