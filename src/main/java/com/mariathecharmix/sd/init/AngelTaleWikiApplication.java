package com.mariathecharmix.sd.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AngelTaleWikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngelTaleWikiApplication.class, args);
	}

}
