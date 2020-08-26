package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmsMvcApplication extends SpringBootInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmsMvcApplication.class, args);
		System.out.println("END MVC");
	}

}
